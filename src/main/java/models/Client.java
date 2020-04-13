package models;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


@Entity
@NamedQueries({
@NamedQuery(name = Client.GET_ALL_CLIENTS_QUERY_NAME, query="SELECT c FROM Client c"),
@NamedQuery(name = Client.GET_ALL_CLIENTS_IDS, query="SELECT c.id FROM Client c"),
@NamedQuery(name = Client.UPDATE_POTENTIAL_REVENUE, query = "UPDATE Client c SET c.potentialRevenue = c.potentialRevenue + :value WHERE c.id =:id"),
@NamedQuery(name = Client.UPDATE_DECREASE_POTENTIAL_REVENUE, query = "UPDATE Client c SET c.potentialRevenue = c.potentialRevenue - :value WHERE c.id =:id")
})

public class Client extends Entity_

{ 
	
	public static final String GET_ALL_CLIENTS_QUERY_NAME = "Product.getAllClients" ;
	public static final String GET_ALL_CLIENTS_IDS = "Product.getAllClientsIds";
	public static final String UPDATE_POTENTIAL_REVENUE = "Client.updateRevenue";
	public static final String UPDATE_DECREASE_POTENTIAL_REVENUE = "Client.updateDecreaseRevenue";
	
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


