package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Interaction extends Entity_ {

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
