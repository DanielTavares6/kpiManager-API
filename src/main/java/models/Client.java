package models;

import javax.persistence.Entity;

@Entity
public class Client extends Entity_

{ 
	
	private static final long serialVersionUID = 1L;
	private long nipc;
	private long potentialRevenue;
	
//	public Client() 
//	
//	{
//		isCollective = true;
//	}



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