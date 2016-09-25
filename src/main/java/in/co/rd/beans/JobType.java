package in.co.rd.beans;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service
public class JobType extends DomainObject{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7265380676227578651L;

	private Long jobTypeKey;
	
	private String jobTypeName;
	
	private String description;
	
	private BigDecimal unitPrice;

	public Long getJobTypeKey() {
		return jobTypeKey;
	}

	public void setJobTypeKey(Long jobTypeKey) {
		this.jobTypeKey = jobTypeKey;
	}

	public String getJobTypeName() {
		return jobTypeName;
	}

	public void setJobTypeName(String jobTypeName) {
		this.jobTypeName = jobTypeName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

}
