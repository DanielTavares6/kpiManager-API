package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name = Interaction.GET_ALL, query="SELECT i FROM Interaction i ORDER BY i.dateInteraction"),
	@NamedQuery(name = Interaction.GET_ALL_WEEKS, query="SELECT DISTINCT i.dateInteraction FROM Interaction i ORDER BY i.dateInteraction"),
	@NamedQuery(name = Interaction.GET_ALL_UNITIES, query="SELECT DISTINCT i.idUnit FROM Interaction i ORDER BY i.idUnit"),
	@NamedQuery(name = Interaction.GET_ALL_B_MANAGERS, query="SELECT DISTINCT i.idPerson FROM Interaction i ORDER BY i.idPerson"),
	@NamedQuery(name = Interaction.GET_ALL_CLIENTS, query="SELECT DISTINCT i.idClient FROM Interaction i ORDER BY i.idClient"),
//	@NamedQuery(name = Interaction.GET_ALL_INTERACTIONS, query="SELECT DISTINCT i.interacao FROM Interaction i ORDER BY i.interacao"),
//	@NamedQuery(name = Interaction.GET_ALL_FILTER, query="SELECT i FROM Interaction i WHERE :filter ORDER BY i.dateInteraction"),
	@NamedQuery(name = Interaction.GET_ALL_SEARCH, query="SELECT i FROM Interaction i WHERE i.dateInteraction LIKE :search"
			+ " OR i.idUnit LIKE :search"
			+ " OR i.idPerson LIKE :search"
			+ " OR i.idClient LIKE :search ORDER BY i.dateInteraction")
})
public class Interaction extends Entity_ {

	public static final String GET_ALL_WEEKS = "Interaction.getAllWeeks";
	public static final String GET_ALL_UNITIES = "Interaction.getAllUnities";
	public static final String GET_ALL_B_MANAGERS = "Interaction.getAllBManagers";
	public static final String GET_ALL_CLIENTS = "Interaction.getAllClients";
//	public static final String GET_ALL_INTERACTIONS = "Interaction.getAllInteractions";
	public static final String GET_ALL_FILTER = "Interaction.getAllFilter";
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
