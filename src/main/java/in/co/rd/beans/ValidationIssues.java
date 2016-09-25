package in.co.rd.beans;

import java.util.ArrayList;
import java.util.List;

public class ValidationIssues extends DomainObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2941720834032377757L;
	
	private List<Issues> issuesList;

	public List<Issues> getIssuesList() {
		if(issuesList == null){
			new ArrayList<Issues>();
		}
		return issuesList;
	}

	public void setIssuesList(List<Issues> issuesList) {
		this.issuesList = issuesList;
	}

}
