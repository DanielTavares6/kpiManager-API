package models;

public abstract class Person extends Entity_

{

	protected Boolean isCollective;
	private String username;
	private String password;
	private String name;
	// In the client, unit means the company unit that runs that business
	// In the manager, unit means the company unit where the manager is from
	private String unit;
	//Role will define the permissions
	private String role;
	

	public String getUsername()
	
	{
		return username;
	}
	public void setUsername(String username) 
	
	{
		this.username = username;
	}
	public String getPassword()
	
	{
		return password;
	}
	public void setPassword(String password) 
	
	{
		this.password = password;
	}
	public String getName() 
	
	{
		return name;
	}
	public void setName(String name) 
	
	{
		this.name = name;
	}
	public String getUnit() 
	
	{
		return unit;
	}
	public void setUnit(String unit) 
	
	{
		this.unit = unit;
	}
	public String getRole() 
	
	{
		return role;
	}
	public void setRole(String role) 
	
	{
		this.role = role;
	}
	
	public Boolean getIsCollective()
	{
		return isCollective;
	}
	public void setIsCollective(Boolean isCollective) 
	{
		this.isCollective = isCollective;
	}
	
	
	
	
}


