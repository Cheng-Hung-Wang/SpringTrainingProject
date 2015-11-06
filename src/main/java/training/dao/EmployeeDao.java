package training.dao;

// Generated Oct 30, 2015 4:35:52 PM by Hibernate Tools 3.4.0.CR1

import java.util.List;
import training.jpa.Employee;

/**
 * Home object for domain model class Employee.
 * @see training.dao.Employee
 * @author Hibernate Tools
 */
public interface EmployeeDao {


	public void delete(Employee persistentInstance) ;

	public Employee findById(java.lang.Integer id) ;
}
