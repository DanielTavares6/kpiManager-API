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
	@NamedQuery(name = Interaction.GET_ALL_WEEKS_FILTER, query="SELECT i.dateInteraction FROM Interaction i WHERE i.dateInteraction = :filter ORDER BY i.dateInteraction"),
	@NamedQuery(name = Interaction.GET_ALL_UNITIES, query="SELECT DISTINCT i.unit FROM Interaction i ORDER BY i.unit"),
	@NamedQuery(name = Interaction.GET_ALL_UNITIES_FILTER, query="SELECT i.unit FROM Interaction i WHERE i.unit = :filter ORDER BY i.unit"),
	@NamedQuery(name = Interaction.GET_ALL_B_MANAGERS, query="SELECT DISTINCT i.person FROM Interaction i ORDER BY i.person"),
	@NamedQuery(name = Interaction.GET_ALL_B_MANAGERS_FILTER, query="SELECT DISTINCT i.person FROM Interaction i WHERE i.person = :filter ORDER BY i.person"),
	@NamedQuery(name = Interaction.GET_ALL_CLIENTS, query="SELECT DISTINCT i.client FROM Interaction i ORDER BY i.client"),
	@NamedQuery(name = Interaction.GET_ALL_CLIENTS_FILTER, query="SELECT DISTINCT i.client FROM Interaction i WHERE i.client = :filter ORDER BY i.client"),
	@NamedQuery(name = Interaction.GET_ALL_INTERACTIONS, query="SELECT DISTINCT i.interactionType FROM Interaction i ORDER BY i.interactionType"),
	@NamedQuery(name = Interaction.GET_ALL_INTERACTIONS_FILTER, query="SELECT DISTINCT i.interactionType FROM Interaction i WHERE i.interactionType = :filter ORDER BY i.interactionType"),

//	@NamedQuery(name = Interaction.GET_ALL_FILTER, query="SELECT i FROM Interaction i WHERE :filter ORDER BY i.dateInteraction"),
	
	@NamedQuery(name = Interaction.GET_ALL_SEARCH, query="SELECT i FROM Interaction i WHERE i.dateInteraction LIKE :search"
			+ " OR i.unit LIKE :search"
			+ " OR i.person LIKE :search"
			+ " OR i.client LIKE :search ORDER BY i.dateInteraction")
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
	
	private static final long serialVersionUID = 1L;

	private String dateInteraction;
	
	@OneToOne
	@JoinColumn(name = "person_id", referencedColumnName = "id") // It's going to make a reference to each individual table
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
