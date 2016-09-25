package in.co.rd.biz;

import in.co.rd.beans.Credentials;
import in.co.rd.beans.Result;
import in.co.rd.dao.LoginDao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceBean implements LoginService {
	private final Logger logger = Logger.getLogger(getClass());

	private Result result;

	@SuppressWarnings("resource")
	public Result login(Credentials credentials) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"config/daoconfig.xml");
		ApplicationContext contextBeans = new ClassPathXmlApplicationContext(
				"config/config.xml");
		LoginDao loginDao = (LoginDao) context.getBean("login");
		List<Credentials> list = loginDao.fetchCredentials(credentials);
		result = (Result) contextBeans.getBean("result");
		if (list == null || list.isEmpty()) {
			result.setDomainObject(credentials);
			result.setErrorCode("LF");
			result.setErrorMessage("username or password is incorrect.");
			return result;
		}
		result.setDomainObject(list.get(0));
		result.setErrorCode(validateUser(list, credentials));

		return result;
	}

	private String validateUser(List<Credentials> list, Credentials credentials) {
		if (list.size() > 1) {
			logger.error("Multiple user returned for a single username.");
			return "MUF";
		}
		if (!"A".equalsIgnoreCase(list.get(0).getActStatus())) {
			return "UNA";
		} else if (!list.get(0).getPassword().equals(credentials.getPassword())) {
			return "UPI";
		}
		return null;
	}

	public Result logout(Credentials credentials) {
		// TODO Auto-generated method stub
		return result;
	}

}
