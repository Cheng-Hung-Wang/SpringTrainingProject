package training.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import training.dao.DepartmentDao;
import training.jpa.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Inject
	DepartmentDao departmentDao;

	@Override
	public Department getDepartment(int id) {		
		return departmentDao.findById(id);
	}
	
	
}
