package models;

import javax.persistence.Entity;

@Entity
public class InteractionType extends Entity_

{


	private static final long serialVersionUID = 1L;
	
	private String interactionType;

	
	public String getInteractionType()
	
	{
		return interactionType;
	}

	public void setInteractionType(String interactionType) 
	
	{
		this.interactionType = interactionType;
	}
	
	

}
