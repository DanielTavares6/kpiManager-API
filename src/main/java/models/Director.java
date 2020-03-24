package models;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name = Director.GET_ALL_WEEKS, query="SELECT DISTINCT d.semana FROM Director")
})
public class Director extends Person 

{
	
	public static final String GET_ALL_WEEKS = "Director.getAllWeeks";
	
	private static final long serialVersionUID = 1L;
	
	public Director(){
		
	}

}
