package filters;

import java.io.IOException;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.nio.file.AccessDeniedException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Priority;
import javax.annotation.security.DenyAll;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.Priorities;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

import controllers.PersonController.Secured;
import utils.DecoderUtils;

@Provider
@Priority(Priorities.AUTHORIZATION)
public class AuthorizationFilter implements ContainerRequestFilter {


    @Context
    private ResourceInfo resourceInfo;

    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {

        Method method = resourceInfo.getResourceMethod();

        // @DenyAll on the method takes precedence over @RolesAllowed and @PermitAll
        if (method.isAnnotationPresent(DenyAll.class)) {
            refuseRequest();
        }

        // @RolesAllowed on the method takes precedence over @PermitAll
        RolesAllowed rolesAllowed = method.getAnnotation(RolesAllowed.class);
        if (rolesAllowed != null) {
        	System.out.println(rolesAllowed.value());
        	 System.out.println(requestContext);
            performAuthorization(rolesAllowed.value(), requestContext);
 
            return;
        }

        // @PermitAll on the method takes precedence over @RolesAllowed on the class
        if (method.isAnnotationPresent(PermitAll.class)) {
            // Do nothing
            return;
        }

        // @DenyAll can't be attached to classes

        // @RolesAllowed on the class takes precedence over @PermitAll on the class
        rolesAllowed = 
            resourceInfo.getResourceClass().getAnnotation(RolesAllowed.class);
        if (rolesAllowed != null) {
            performAuthorization(rolesAllowed.value(), requestContext);
        }

        // @PermitAll on the class
        if (resourceInfo.getResourceClass().isAnnotationPresent(PermitAll.class)) {
            // Do nothing
            return;
        }

        // Authentication is required for non-annotated methods
        if (!isAuthenticated(requestContext)) {
            refuseRequest();
        }
    }

    /**
     * Perform authorization based on roles.
     *
     * @param rolesAllowed
     * @param requestContext
     * @throws AccessDeniedException 
     */
    private void performAuthorization(String[] rolesAllowed, 
                                      ContainerRequestContext requestContext) throws AccessDeniedException {

        if (rolesAllowed.length > 0 && !isAuthenticated(requestContext)) {
            refuseRequest();
        }

        for (final String role : rolesAllowed) {
        	System.out.println("role   "  + role );
        	System.out.println(requestContext.getSecurityContext().isUserInRole(role));
            if (requestContext.getSecurityContext().isUserInRole(role)) {
                return;
            }
        }
        try {
			refuseRequest();
		} catch (AccessDeniedException e)  {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new AccessDeniedException(e.getMessage()) ;
		}
    }

    /**
     * Check if the user is authenticated.
     *
     * @param requestContext
     * @return
     */
    private boolean isAuthenticated(final ContainerRequestContext requestContext) {
       
        return requestContext.getSecurityContext().getUserPrincipal() != null;
    }

    /**
     * Refuse the request.
     * @throws AccessDeniedException 
     */
    private void refuseRequest() throws AccessDeniedException {
        throw new AccessDeniedException(
            "You don't have permissions to perform this action.");
    }
}