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
})
public class Person extends Entity_

{

	public static final String GET_PERSON_BY_USERNAME = "Person.getPersonByUsername";
	public static final String GET_ALL_PERSON_QUERY_NAME = "Person.getAllPersons" ;
	public static final String GET_ALL_PERSON_IDS = "Person.getAllPersonsIds";
	

	private static final long serialVersionUID = 1L;

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







