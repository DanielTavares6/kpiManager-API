package models;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name = Director.GET_ALL_WEEKS, query="SELECT DISTINCT d.semana FROM Director d ORDER BY d.semana"),
	@NamedQuery(name = Director.GET_ALL_UNITIES, query="SELECT DISTINCT d.unidade FROM Director d ORDER BY d.unidade"),
	@NamedQuery(name = Director.GET_ALL_B_MANAGERS, query="SELECT DISTINCT d.bManager FROM Director d ORDER BY d.bManager"),
	@NamedQuery(name = Director.GET_ALL_CLIENTS, query="SELECT DISTINCT d.cliente FROM Director d ORDER BY d.cliente"),
	@NamedQuery(name = Director.GET_ALL_INTERACTIONS, query="SELECT DISTINCT d.interacao FROM Director d ORDER BY d.interacao"),
	@NamedQuery(name = Director.GET_ALL_FILTER, query="SELECT d FROM Director d WHERE :filter ORDER BY d.semana"),
	@NamedQuery(name = Director.GET_ALL_SEARCH, query="SELECT d FROM Director d WHERE d.semana LIKE :search"
			+ "OR d.unidade LIKE :search"
			+ "OR d.bManager LIKE :search"
			+ "OR d.cliente LIKE :search"
			+ "OR d.interacao LIKE :search ORDER BY d.semana")
})
public class Director extends Person 

{
	public static final String GET_ALL_WEEKS = "Director.getAllWeeks";
	public static final String GET_ALL_UNITIES = "Director.getAllUnities";
	public static final String GET_ALL_B_MANAGERS = "Director.getAllBManagers";
	public static final String GET_ALL_CLIENTS = "Director.getAllClients";
	public static final String GET_ALL_INTERACTIONS = "Director.getAllInteractions";
	public static final String GET_ALL_FILTER = "Director.getAllFilter";
	public static final String GET_ALL_SEARCH = "Director.getAllSearch";


	private static final long serialVersionUID = 1L;
	
	public Director(){
		
	}
	
	

}
