package models;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
@NamedQuery(name = Manager.GET_ALL_MANAGERS_QUERY_NAME, query="SELECT c FROM Manager c"),
@NamedQuery(name = Manager.GET_ALL_MANAGERS_IDS, query="SELECT c FROM Manager c")
})
public class Manager extends Person

{

	public static final String GET_ALL_MANAGERS_QUERY_NAME = "Product.getAllManagers" ;
	public static final String GET_ALL_MANAGERS_IDS = "Product.getAllManagersIds";
	
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
