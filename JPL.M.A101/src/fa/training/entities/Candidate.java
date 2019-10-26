package fa.training.entities;

import java.io.Serializable;

/**
 * The Class Candidate
 * 
 * @author CuongTV21
 *
 */
public class Candidate implements Serializable {

	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private String birthDate;
	private String address;
	private String phone;
	private String email;

	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Candidate(String firstName, String lastName, String birthDate, String address, String phone, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.address = address;
		this.phone = phone;
		this.email = email;
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

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Candidate [firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate
				+ ", address=" + address + ", phone=" + phone + ", email=" + email + "]";
	}

}
