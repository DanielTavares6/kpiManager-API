package models;

public class Manager extends Person

{

	// currentPortfolio is the current total sum of client's contract values

	private long currentPortfolio;
	
	public Manager() 
	
	{
		isCollective = true;
	}

	public long getCurrentPortfolio() {
		return currentPortfolio;
	}

	public void setCurrentPortfolio(long currentPortfolio) {
		this.currentPortfolio = currentPortfolio;
	}
	
	

}
