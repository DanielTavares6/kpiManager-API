package models;

public class Client extends Person

{ 
	
	//Client is a collective Person
	
	private long nipc;
	private long potentialRevenue;
	

	public Client() 
	
	{
		isCollective = true;
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