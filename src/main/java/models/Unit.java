package models;

import javax.persistence.Entity;

@Entity
public class Unit extends Entity_ {

	private static final long serialVersionUID = 1L;
	private String nameUnit;

	public String getNameUnit() {
		return nameUnit;
	}

	public void setNameUnit(String nameUnit) {
		this.nameUnit = nameUnit;
	}

}
