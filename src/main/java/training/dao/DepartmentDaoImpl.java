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

import training.jpa.Department;

/**
 * Home object for domain model class Department.
 * @see training.dao.Department
 * @author Hibernate Tools
 */

@Service
public class DepartmentDaoImpl implements DepartmentDao{

	private static final Log log = LogFactory.getLog(DepartmentDaoImpl.class);

	@Autowired
	private SessionFactory sessionFactory;
		
	private Session getS() {
		return sessionFactory.getCurrentSession();
	}

	public void delete(Department persistentInstance) {
		log.debug("deleting Department instance");
		try {
			getS().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}


	public Department findById(java.lang.Integer id) {
		log.debug("getting Department instance with id: " + id);
		try {
			Department instance = (Department) getS().get("training.jpa.Department", id);
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
