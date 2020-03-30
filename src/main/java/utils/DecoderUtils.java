package utils;
import org.apache.commons.codec.binary.Base64;
public class DecoderUtils {
	
	
  public String decodeJWT(String bearer){
        String jwtToken = bearer;
        //"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJyb2xlIjoiQ09PIiwidXNlcm5hbWUiOiJDT08ifQ._9xakTs056TKSu3nP_RYLx-PWtGYgKdxTNq-neo83ZU";
        System.out.println("------------ Decode JWT ------------");
        String[] split_string = jwtToken.split("\\.");
        String base64EncodedHeader = split_string[0];
        String base64EncodedBody = split_string[1];
        String base64EncodedSignature = split_string[2];

        System.out.println("~~~~~~~~~ JWT Header ~~~~~~~");
        Base64 base64Url = new Base64(true);
        String header = new String(base64Url.decode(base64EncodedHeader));
        System.out.println("JWT Header : " + header);


        System.out.println("~~~~~~~~~ JWT Body ~~~~~~~");
        String body = new String(base64Url.decode(base64EncodedBody));
        System.out.println("JWT Body : "+body);
        
        return body;
    }
  	
 	
}


  