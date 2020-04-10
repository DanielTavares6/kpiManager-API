package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import models.Unit;

@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = "name"), @UniqueConstraint(columnNames = "nipc") }) // unique values in DB
@NamedQueries({ @NamedQuery(name = Client.GET_ALL_CLIENTS, query = "SELECT c FROM Client c"),
		@NamedQuery(name = Client.GET_ALL_CLIENTS_IDS, query = "SELECT c.id FROM Client c"),
		@NamedQuery(name = Client.GET_CLIENT_BY_NAME, query = "SELECT c FROM Client c WHERE c.name =:name"),
		@NamedQuery(name= Client.GET_CLIENT_BY_NIPC, query = "SELECT c FROM Client c WHERE c.nipc =:nipc"),
		@NamedQuery(name=  Client.CLEAR_INTERACTION_BY_CLIENTID , query=" DELETE FROM Interaction i WHERE i.client.id = :clientId"),
})

public class Client extends Entity_

{
	public static final String GET_ALL_CLIENTS = "Client.getAllClients";
	public static final String GET_ALL_CLIENTS_IDS = "Client.getAllClientsIds";
	public static final String GET_CLIENT_BY_NAME = "Client.getClientByName";
	public static final String GET_CLIENT_BY_NIPC = "Client.getClientByNipc";
	public static final String CLEAR_INTERACTION_BY_CLIENTID = "Client.clearInteractionByClientId";

	private static final long serialVersionUID = 1L;

	private String name;
	private int nipc;
	private int potentialRevenue;
	
	public Client() {
	}

	public String getName()

	{
		return name;
	}

	public void setName(String name)

	{
		this.name = name;
	}

	public int getNipc()

	{
		return nipc;
	}

	public void setNipc(int nipc)
	{
		this.nipc = nipc;
	}
	
	public int getPotentialRevenue()

	{
		return potentialRevenue;
	}

	public void setPotentialRevenue(int potentialRevenue)
	{
		this.potentialRevenue = potentialRevenue;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", nipc=" + nipc + ", potentialRevenue=" + potentialRevenue +"]";
	}
	
	}


