package models;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name = Director.GET_ALL_WEEKS, query="SELECT DISTINCT d.semana FROM Director d ORDER BY d.semana"),
	@NamedQuery(name = Director.GET_ALL_UNITIES, query="SELECT DISTINCT d.unidade FROM Director d ORDER BY d.semana"),
	@NamedQuery(name = Director.GET_ALL_B_MANAGERS, query="SELECT DISTINCT d.bManager FROM Director d ORDER BY d.semana"),
	@NamedQuery(name = Director.GET_ALL_CLIENTS, query="SELECT DISTINCT d.cliente FROM Director d ORDER BY d.semana"),
	@NamedQuery(name = Director.GET_ALL_INTERACTIONS, query="SELECT DISTINCT d.interacao FROM Director d ORDER BY d.semana")
})
public class Director extends Person 

{
	
	public static final String GET_ALL_WEEKS = "Director.getAllWeeks";
	public static final String GET_ALL_UNITIES = "Director.getAllUnities";
	public static final String GET_ALL_B_MANAGERS = "Director.getAllBManagers";
	public static final String GET_ALL_CLIENTS = "Director.getAllClients";
	public static final String GET_ALL_INTERACTIONS = "Director.getAllInteractions";

	
	private static final long serialVersionUID = 1L;
	
	public Director(){
		
	}

}
