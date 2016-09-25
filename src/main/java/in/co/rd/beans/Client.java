package in.co.rd.beans;

import org.springframework.stereotype.Service;

@Service
public class Client extends DomainObject{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6193130901959703581L;
	
	private String hospitalName;
	
	private String title;
	
	private String firstName;
	
	private String lastName;
	
	private String gender;
	
	private Address address;	
	
	private Contact contact;

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}
	

}
