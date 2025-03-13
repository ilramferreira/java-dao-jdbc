package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private String email;
	private Date birthDate;
	private Double baseSalary;
	
	private Department department;
	
	//Construtores
	public Seller() {}
	
	public Seller(Integer id, String name, String email, Date birthDate, Double baseSalary, Department department) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
		this.baseSalary = baseSalary;
		this.department = department;
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

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Double getBaseSalary() {
		return this.baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public Department getDepartment() {
		return this.department;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	//HashCode
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	//Equals
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj) {return true;}
		
		if(obj == null) {return false;}
		
		if(getClass() != obj.getClass()) {return false;}
		
		Seller other = (Seller) obj;
		return Objects.equals(id, other.id);
	}
	
	//ToString
	public String toString() {
		return "ID: " + id 
				+", Nome: " + name
				+", E-mail: " + email
				+", Data de Nascimento: " + birthDate
				+", Salário Base:" + String.format("%.2f", baseSalary)
				+", " + department;
	}
}
