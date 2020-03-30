package models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Interaction extends Entity_

{

	private static final long serialVersionUID = 1L;
	private String dateInteraction;
	
	// These are the child entities (check Person, Unit, Client and InteractionType to see parent entites and its annotations
	
	// Not sure if implemented as for example:  https://vladmihalcea.com/the-best-way-to-map-a-onetoone-relationship-with-jpa-and-hibernate/
	
	@OneToOne
	@JoinColumn(name = "person_id", referencedColumnName = "id") // It's going to make a reference to each individual table of person, unit, client
	private Person person;
	@OneToOne
	@JoinColumn(name = "unit_id", referencedColumnName = "id")
	private Unit unit;
	@OneToOne
	@JoinColumn(name = "client_id", referencedColumnName = "id")
	private Client client;
	@OneToOne
	@JoinColumn(name = "interactionType_id", referencedColumnName = "id")
	private InteractionType interactionType;
	
	
	public String getDateInteraction()
	
	{
		return dateInteraction;
	}
	
	public void setDateInteraction(String dateInteraction) 
	
	{
		this.dateInteraction = dateInteraction;
	}
	
	public Person getPerson() 
	
	{
		return person;
	}
	
	public void setPerson(Person person) 
	
	{
		this.person = person;
	}
	
	public Unit getUnit() 
	
	{
		return unit;
	}
	
	public void setUnit(Unit unit)
	
	{
		this.unit = unit;
	}
	
	public Client getClient() 
	
	{
		return client;
	}
	
	public void setClient(Client client) 
	
	{
		this.client = client;
	}
	
	public InteractionType getInteractionType() 
	
	{
		return interactionType;
	}
	
	public void setInteractionType(InteractionType interactionType) 
	
	{
		this.interactionType = interactionType;
	}
	
	

	

}
