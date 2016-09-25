package in.co.rd.biz;

import java.util.List;

import in.co.rd.beans.JobDetails;

public interface ManageJobBizService {
	
	public boolean createJobDetails(JobDetails jobDetails);

	public JobDetails fetchJobDetails(int parseInt);
	
	public List<JobDetails> fetchJobList();

}
