package in.co.rd.beans;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class JobDetails extends DomainObject{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3518804364876529284L;

	/**
	 * Combination of 'RD' , date and sequence number.
	 * e.g RDDDMMYY0001
	 */
	private String jobNumber;
	
	private Long clientKey;
	
	private String patientName;
	
	private String toothNumber;
	
	private ClientsJobType jobTypeKey;
	
	private String shade;
	
	private Long unit;
	
	private Date deliveryDate;
	
	private Date receivedDate;
	
	private BigDecimal amount;
	
	private String priceDesc;
	
	private String drComments;
	
	private String techComments;
	
	private String status;
	
	public String getJobNumber() {
		return jobNumber;
	}

	public void setJobNumber(String jobNumber) {
		this.jobNumber = jobNumber;
	}

	public Long getClientKey() {
		return clientKey;
	}

	public void setClientKey(Long clientKey) {
		this.clientKey = clientKey;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getToothNumber() {
		return toothNumber;
	}

	public void setToothNumber(String toothNumber) {
		this.toothNumber = toothNumber;
	}

	public ClientsJobType getJobTypeKey() {
		return jobTypeKey;
	}

	public void setJobTypeKey(ClientsJobType jobTypeKey) {
		this.jobTypeKey = jobTypeKey;
	}

	public String getShade() {
		return shade;
	}

	public void setShade(String shade) {
		this.shade = shade;
	}

	public Long getUnit() {
		return unit;
	}

	public void setUnit(Long unit) {
		this.unit = unit;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Date getReceivedDate() {
		return receivedDate;
	}

	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getPriceDesc() {
		return priceDesc;
	}

	public void setPriceDesc(String priceDesc) {
		this.priceDesc = priceDesc;
	}

	public String getDrComments() {
		return drComments;
	}

	public void setDrComments(String drComments) {
		this.drComments = drComments;
	}

	public String getTechComments() {
		return techComments;
	}

	public void setTechComments(String techComments) {
		this.techComments = techComments;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
}
