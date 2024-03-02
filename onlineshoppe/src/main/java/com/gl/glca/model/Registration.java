package com.gl.glca.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="registration")
public class Registration {


	@Id
	@Column(name="registrationId")
	String registrationId;
	
	@Column(name="customerName")
	String customerName;
	
	@Column(name="loginId")
	String loginId;
	
	@Column(name="password")
	String password;
	
	@Column(name="occupation")
	String occupation; //DropDown
	
	@Column(name="address")
	String address;
	
	@Column(name="gender")
	String gender; // radio
	
	@Column(name="eMail")
	String eMail;
	
	@Column(name="mobileNo")
	String mobileNo;

	public Registration() {
		super();
	}

	
	



	public String getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Registration [ registrationId=" + registrationId + ", customerName=" + customerName
				+ ", loginId=" + loginId + ", password=" + password + ", occupation=" + occupation + ", address="
				+ address + ", gender=" + gender + ", eMail=" + eMail + ", mobileNo=" + mobileNo + "]";
	}
	
	
	
}
