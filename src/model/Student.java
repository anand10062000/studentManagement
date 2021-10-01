package model;

import modeladdress.Address;

public class Student {
	String firstName;
	String lastName;
	String middleName;
	String emailId;
	String mobileNum;
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", middleName=" + middleName
				+ ", emailId=" + emailId + ", mobileNum=" + mobileNum + ", address=" + address + "]";
	}
	Address address;
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
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
