package training.dao;

// Generated Oct 30, 2015 4:35:52 PM by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import training.jpa.Employee;

/**
 * Home object for domain model class Employee.
 * @see training.dao.Employee
 * @author Hibernate Tools
 */

@Service
public class EmployeeDaoImpl implements EmployeeDao{

	private static final Log log = LogFactory.getLog(EmployeeDaoImpl.class);
		
	@Autowired
	private SessionFactory sessionFactory;
		
	private Session getS() {
		return sessionFactory.getCurrentSession();
	}

	public void delete(Employee persistentInstance) {
		log.debug("deleting Employee instance");
		try {
			getS().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}


	public Employee findById(java.lang.Integer id) {
		log.debug("getting Employee instance with id: " + id);
		try {
			Employee instance = (Employee) getS().get("training.jpa.Employee", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

}
