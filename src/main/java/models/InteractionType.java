package models;

import javax.persistence.Entity;

@Entity
public class InteractionType extends Entity_{

	private static final long serialVersionUID = 1L;
	
	private String interactionType;

	public String getInteractionTpe() {
		return interactionType;
	}
	public void setInteractionTpe(String interactionType) {
		this.interactionType = interactionType;
	}
	

}
