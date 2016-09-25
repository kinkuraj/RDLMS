package in.co.rd.biz;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import in.co.rd.beans.JobDetails;
import in.co.rd.dao.JobDetailsDao;

@Service
public class ManageJobBizServiceImpl implements ManageJobBizService{
	ApplicationContext context;
	
	
	public ApplicationContext getContext() {
		if(context == null){
			setContext(new ClassPathXmlApplicationContext(
			"config/daoconfig.xml"));
		}
		return context;
	}

	public void setContext(ApplicationContext context) {
		this.context = context;
	}

	public boolean createJobDetails(JobDetails jobDetails) {
		// TODO Auto-generated method stub
		return false;
	}

	public JobDetails fetchJobDetails(int parseInt) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<JobDetails> fetchJobList() {
		JobDetailsDao jobDetailsDao = (JobDetailsDao) getContext().getBean("jobDetailsDao");
		return jobDetailsDao.fetchJobList();
	}

}
