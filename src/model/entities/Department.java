package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
		
	public Department() {}
	
	public Department(Integer id, String name) {
		
		this.id = id;
		this.name = name;
		}

	
	//Getters/Setters
	public Integer getId() {
		
		return this.id;
	}
	
	public void setId(Integer id) {
		
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}


	//HashCode
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	
	//Equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(id, other.id);
	}

	//ToString
	@Override
	public String toString() {
		return "Department: ID= " + id + ", Name= " + name + ".d";
	}
	
	
	
	
	
}
