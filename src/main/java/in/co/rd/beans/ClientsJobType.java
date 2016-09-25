package in.co.rd.beans;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service
public class ClientsJobType extends DomainObject{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -500687732377031030L;

	private Long jobTypeKey;
	
	private Long clientKey;
	
	private BigDecimal unitPrice;

	public Long getJobTypeKey() {
		return jobTypeKey;
	}

	public void setJobTypeKey(Long jobTypeKey) {
		this.jobTypeKey = jobTypeKey;
	}

	public Long getClientKey() {
		return clientKey;
	}

	public void setClientKey(Long clientKey) {
		this.clientKey = clientKey;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
}
