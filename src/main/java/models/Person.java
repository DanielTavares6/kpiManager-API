package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public abstract class Person extends Entity_

{

	@Override
	public String toString() {
		return "Person [username=" + username + ", hashcode=" + hashcode + ", salt=" + salt + ", name=" + name
				+ ", email=" + email + ", typeUser=" + typeUser + ", unit=" + unit + ", role=" + role + "]";
	}

	private static final long serialVersionUID = 1L;

	private String username;
	private String hashcode;
	private String salt;
	private String name;
	private String email;
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

}
