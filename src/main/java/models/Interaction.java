package models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

@Entity
@NamedQueries({
	@NamedQuery(name = Interaction.GET_ALL, query="SELECT i FROM Interaction i ORDER BY i.dateInteraction"),
	@NamedQuery(name = Interaction.GET_ALL_WEEKS, query="SELECT DISTINCT i.dateInteraction FROM Interaction i ORDER BY i.dateInteraction"),
	@NamedQuery(name = Interaction.GET_ALL_WEEKS_FILTER, query="SELECT i FROM Interaction i WHERE i.dateInteraction = :filter ORDER BY i.dateInteraction"),
	@NamedQuery(name = Interaction.GET_ALL_UNITIES, query="SELECT DISTINCT i.unit.nameUnit FROM Interaction i ORDER BY i.unit.nameUnit"),
	@NamedQuery(name = Interaction.GET_ALL_UNITIES_FILTER, query="SELECT i FROM Interaction i WHERE i.unit.nameUnit = :filter ORDER BY i.unit.nameUnit"),
	@NamedQuery(name = Interaction.GET_ALL_B_MANAGERS, query="SELECT DISTINCT i.person.name FROM Interaction i ORDER BY i.person.name"),
	@NamedQuery(name = Interaction.GET_ALL_B_MANAGERS_FILTER, query="SELECT i FROM Interaction i WHERE i.person.name = :filter ORDER BY i.person.name"),
	@NamedQuery(name = Interaction.GET_ALL_CLIENTS, query="SELECT DISTINCT i.client.name FROM Interaction i ORDER BY i.client.name"),
	@NamedQuery(name = Interaction.GET_ALL_CLIENTS_FILTER, query="SELECT i FROM Interaction i WHERE i.client.name = :filter ORDER BY i.client.name"),
	@NamedQuery(name = Interaction.GET_ALL_INTERACTIONS, query="SELECT DISTINCT i.interactionType.interactionType FROM Interaction i ORDER BY i.interactionType.interactionType"),
	@NamedQuery(name = Interaction.GET_ALL_INTERACTIONS_FILTER, query="SELECT i FROM Interaction i WHERE i.interactionType.interactionType = :filter ORDER BY i.interactionType"),
	@NamedQuery(name=  Interaction.GET_INTERACTION_BY_CLIENTID , query=" SELECT i FROM Interaction i WHERE i.client.id = :clientId ORDER BY i.client.name"),
	
//	@NamedQuery(name = Interaction.GET_ALL_FILTER, query="SELECT i FROM Interaction i WHERE :filter ORDER BY i.dateInteraction"),
	
	@NamedQuery(name = Interaction.GET_ALL_SEARCH, query="SELECT i FROM Interaction i WHERE i.dateInteraction LIKE :search"
			+ " OR i.unit.nameUnit LIKE :search"
			+ " OR i.person.name LIKE :search"
			+ " OR i.interactionType.interactionType LIKE :search"
			+ " OR i.client.name LIKE :search ORDER BY i.dateInteraction")
})

public class Interaction extends Entity_ {

	public static final String GET_ALL_WEEKS = "Interaction.getAllWeeks";
	public static final String GET_ALL_WEEKS_FILTER = "Interaction.getAllWeeksFilter";
	public static final String GET_ALL_UNITIES = "Interaction.getAllUnities";
	public static final String GET_ALL_UNITIES_FILTER = "Interaction.getAllUnitiesFilter";
	public static final String GET_ALL_B_MANAGERS = "Interaction.getAllBManagers";
	public static final String GET_ALL_B_MANAGERS_FILTER = "Interaction.getAllBManagersFilter";
	public static final String GET_ALL_CLIENTS = "Interaction.getAllClients";
	public static final String GET_ALL_CLIENTS_FILTER = "Interaction.getAllClientsFilter";
	public static final String GET_ALL_INTERACTIONS = "Interaction.getAllInteractions";
	public static final String GET_ALL_INTERACTIONS_FILTER = "Interaction.getAllInteractionsFilter";
//	public static final String GET_ALL_FILTER = "Interaction.getAllFilter";
	public static final String GET_ALL_SEARCH = "Interaction.getAllSearch";
	public static final String GET_ALL = "Interaction.getAll";
	
	/********************************/
	public static final String GET_INTERACTION_BY_CLIENTID = "Interaction.getInteractionsByClientId";
	/********************************/
	
	
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
