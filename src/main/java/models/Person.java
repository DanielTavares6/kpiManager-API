package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public abstract class Person extends Entity_

{

	private static final long serialVersionUID = 1L;

	protected Boolean isCollective;
	private String username;
	private String password;
	private String name;
	private String typeUser;
	
	@ManyToOne
	private Unit unit;
	// Role will define the permissions
	private String role;

	public Boolean getIsCollective() {
		return isCollective;
	}

	public void setIsCollective(Boolean isCollective) {
		this.isCollective = isCollective;
	}

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
