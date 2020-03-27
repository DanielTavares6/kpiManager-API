package models;

import java.util.Date;

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

	private Date dateInteraction;
	
	@ManyToOne
	private Person idPerson;
	@ManyToOne
	private Unit idUnit;
	@ManyToOne
	private Client idClient;



	public Date getDateInteraction() 
	
	{
		return dateInteraction;
	}

	public void setDateInteraction(Date dateInteraction) 
	
	{
		this.dateInteraction = dateInteraction;
	}

	public Person getIdPerson()
	
	{
		return idPerson;
	}

	public void setIdPerson(Person idPerson) 
	
	{
		this.idPerson = idPerson;
	}

	public Unit getIdUnit() 
	
	{
		return idUnit;
	}

	public void setIdUnit(Unit idUnit) 
	
	{
		this.idUnit = idUnit;
	}

	public Client getIdClient()
	
	{
		return idClient;
	}

	public void setIdClient(Client idClient)
	
	{
		this.idClient = idClient;
	}

}
