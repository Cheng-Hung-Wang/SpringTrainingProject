package training.service;


import javax.inject.Inject;

import org.springframework.stereotype.Service;

import training.dao.EmployeeDao;
import training.jpa.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Inject
	EmployeeDao employeeDao;
	
	
	public Employee getEmployee(int id) {		
		return employeeDao.findById(id);
	}

}
