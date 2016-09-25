package in.co.rd.dao;

import in.co.rd.beans.Credentials;

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
public class LoginDaoImpl implements LoginDao{

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
	public List<Credentials> fetchCredentials(Credentials credentials ){
		logger.info("START : LoginDaoImpl.fetchCredentials");
		Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(Credentials.class);
		criteria.add(Restrictions.eq("userName", credentials.getUserName()));
		List<Credentials> list = criteria.list();
		logger.info("END : LoginDaoImpl.fetchCredentials");
		return list;
		
	}

}
