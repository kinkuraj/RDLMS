package in.co.rd.beans;

import java.io.Serializable;

import org.springframework.stereotype.Service;

@Service
public class DomainObject implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7536055319281771550L;
	private Long entityKey;
	
	private String status;
	
	public Long getEntityKey() {
		return entityKey;
	}
	public void setEntityKey(Long entityKey) {
		this.entityKey = entityKey;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
