package in.co.rd.dao;

import in.co.rd.beans.JobDetails;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@EnableTransactionManagement
public class JobDetailsDao{

	HibernateTemplate template;
	
	@Autowired
	SessionFactory mysessionFactory;
	
	private final Logger logger = Logger.getLogger(getClass());

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	public SessionFactory getSessionFactory() {
		return mysessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.mysessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	public List<JobDetails> fetchJobList(){
		logger.info("START : LoginDaoImpl.fetchJobList");
		Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(JobDetails.class);
		criteria.add(Restrictions.eq("status", "NW"));
		List<JobDetails> list = criteria.list();
		System.out.println("Size: " + list.size());
		logger.info("END : LoginDaoImpl.fetchJobList");
		return list;
		
	}

}
