package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
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
public abstract class Person extends Entity_

{

	private static final long serialVersionUID = 1L;
	
	public static final String GET_ALL_WEEKS = "Director.getAllWeeks";
	public static final String GET_ALL_UNITIES = "Director.getAllUnities";
	public static final String GET_ALL_B_MANAGERS = "Director.getAllBManagers";
	public static final String GET_ALL_CLIENTS = "Director.getAllClients";
	public static final String GET_ALL_INTERACTIONS = "Director.getAllInteractions";
	public static final String GET_ALL_FILTER = "Director.getAllFilter";
	public static final String GET_ALL_SEARCH = "Director.getAllSearch";

	private String username;
	private String password;
	private String name;
	private String typeUser;
	
	@ManyToOne
	private Unit unit;
	// Role will define the permissions
	private String role;

	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTypeUser() {
		return typeUser;
	}

	public void setTypeUser(String typeUser) {
		this.typeUser = typeUser;
	}

	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

}
