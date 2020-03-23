package models;

import javax.persistence.Entity;

@Entity
public class Director extends Person 

{
	Boolean isCollective = false;
	
	public Director()
	
	{
		isCollective = true;
	}

}
