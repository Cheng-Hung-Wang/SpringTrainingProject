package training.jpa;

// Generated Oct 30, 2015 4:33:53 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Department generated by hbm2java
 */
public class Department implements java.io.Serializable {

	private Integer id;
	private String name;
	private int supervisorId;
	private Set employees = new HashSet(0);

	public Department() {
	}

	public Department(String name, int supervisorId) {
		this.name = name;
		this.supervisorId = supervisorId;
	}

	public Department(String name, int supervisorId, Set employees) {
		this.name = name;
		this.supervisorId = supervisorId;
		this.employees = employees;
	}

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

	public int getSupervisorId() {
		return this.supervisorId;
	}

	public void setSupervisorId(int supervisorId) {
		this.supervisorId = supervisorId;
	}

	public Set getEmployees() {
		return this.employees;
	}

	public void setEmployees(Set employees) {
		this.employees = employees;
	}

}