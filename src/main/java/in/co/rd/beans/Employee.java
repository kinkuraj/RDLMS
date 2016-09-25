package in.co.rd.beans;

import org.springframework.stereotype.Service;

@Service
public class Employee extends DomainObject{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2524969523970251284L;

	private String employeeId;
	
	private String firstName;
	
	private String lastName;
	
	private String gender;
	
	private String designation;
	
	private Contact contact;
	
	private Address address;

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}


}
