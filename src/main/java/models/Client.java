package models;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


@Entity
@NamedQueries({
@NamedQuery(name = Client.GET_ALL_CLIENTS_QUERY_NAME, query="SELECT c FROM Client c"),
@NamedQuery(name = Client.GET_ALL_CLIENTS_IDS, query="SELECT c FROM Client c")
})

public class Client extends Entity_

{ 
	
	public static final String GET_ALL_CLIENTS_QUERY_NAME = "Product.getAllClients" ;
	public static final String GET_ALL_CLIENTS_IDS = "Product.getAllClientsIds";
	
	private static final long serialVersionUID = 1L;
	private String name;
	private long nipc;
	private long potentialRevenue;
	
	public Client() 
	
	{

	}

	public String getName() 
	
	{
		return name;
	}

	public void setName(String name) 
	
	{
		this.name = name;
	}

	public long getNipc() 
	
	{
		return nipc;
	}

	public void setNipc(long nipc) 
	
	{
		this.nipc = nipc;
	}

	public long getPotentialRevenue() 
	
	{
		return potentialRevenue;
	}

	public void setPotentialRevenue(long potentialRevenue) 
	
	{
		this.potentialRevenue = potentialRevenue;
	}

	
}


