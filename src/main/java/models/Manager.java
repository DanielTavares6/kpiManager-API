package models;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
@NamedQuery(name = Manager.GET_ALL_MANAGERS_QUERY_NAME, query="SELECT c FROM Manager c"),
@NamedQuery(name = Manager.GET_ALL_MANAGERS_IDS, query="SELECT c.id FROM Manager c"),
@NamedQuery(name = Manager.GET_MANAGER_BY_USERNAME, query="SELECT c FROM Manager c WHERE c.username =:username"),
})
public class Manager extends Person

{
	public static final String GET_MANAGER_BY_USERNAME = "Manager.getManagerByUsername";
	public static final String GET_ALL_MANAGERS_QUERY_NAME = "Manager.getAllManagers" ;
	public static final String GET_ALL_MANAGERS_IDS = "Manager.getAllManagersIds";
	
	private static final long serialVersionUID = 1L;
	// currentPortfolio is the current total sum of client's contract values
	private long currentPortfolio;

	
	public Manager() 
	
	{
		
	}

	public long getCurrentPortfolio()
	
	{
		return currentPortfolio;
	}

	public void setCurrentPortfolio(long currentPortfolio) 
	
	{
		this.currentPortfolio = currentPortfolio;
	}

	
}
