package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
@NamedQuery(name = Person.GET_ALL_PERSON_QUERY_NAME, query="SELECT c FROM Person c"),
@NamedQuery(name = Person.GET_ALL_PERSON_IDS, query="SELECT c.id FROM Person c"),
@NamedQuery(name = Person.GET_PERSON_BY_USERNAME, query="SELECT c FROM Person c WHERE c.username =:username"),
@NamedQuery(name = Person.GET_ALL_WEEKS, query="SELECT DISTINCT p.semana FROM Person d ORDER BY d.semana"),
@NamedQuery(name = Person.GET_ALL_UNITIES, query="SELECT DISTINCT p.unit FROM Person d ORDER BY d.unit"),
@NamedQuery(name = Person.GET_ALL_B_MANAGERS, query="SELECT DISTINCT p.bManager FROM Person d ORDER BY d.bManager"),
@NamedQuery(name = Person.GET_ALL_CLIENTS, query="SELECT DISTINCT p.cliente FROM Person d ORDER BY d.cliente"),
@NamedQuery(name = Person.GET_ALL_INTERACTIONS, query="SELECT DISTINCT d.interacao FROM Person d ORDER BY d.interacao"),
@NamedQuery(name = Person.GET_ALL_FILTER, query="SELECT p FROM Person p WHERE :filter ORDER BY p.semana"),
@NamedQuery(name = Person.GET_ALL_SEARCH, query="SELECT p FROM Person p WHERE p.semana LIKE :search"
		+ "OR p.unidade LIKE :search"
		+ "OR p.bManager LIKE :search"
		+ "OR p.cliente LIKE :search"
		+ "OR p.interacao LIKE :search ORDER BY d.semana")
})
public class Person extends Entity_

{

	private static final long serialVersionUID = 1L;

	public static final String GET_PERSON_BY_USERNAME = "Person.getPersonByUsername";
	public static final String GET_ALL_PERSON_QUERY_NAME = "Person.getAllPersons" ;
	public static final String GET_ALL_PERSON_IDS = "Person.getAllPersonsIds";
	public static final String GET_ALL_WEEKS = "Person.getAllWeeks";
	public static final String GET_ALL_UNITIES = "Person.getAllUnities";
	public static final String GET_ALL_B_MANAGERS = "Person.getAllBManagers";
	public static final String GET_ALL_CLIENTS = "Person.getAllClients";
	public static final String GET_ALL_INTERACTIONS = "Person.getAllInteractions";
	public static final String GET_ALL_FILTER = "Person.getAllFilter";
	public static final String GET_ALL_SEARCH = "Person.getAllSearch";

	private String username;
	private String hashcode;
	private String salt;
	private String name;
	private String email;
	private String role;
	
	@ManyToOne
	private Unit unit;
	
	// Role will define the permissions

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}
//
//	public Unit getUnit() {
//		return unit;
//	}
//
//	public void setUnit(Unit unit) {
//		this.unit = unit;
//	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHashcode() {
		return hashcode;
	}

	public void setHashcode(String hashcode) {
		this.hashcode = hashcode;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}
	
//	@Override
//	public String toString() {
//		return "Person [username=" + username + ", hashcode=" + hashcode + ", salt=" + salt + ", name=" + name
//				+ ", email=" + email + ", unit=" + unit + ", role=" + role + "]";
//	}

}







