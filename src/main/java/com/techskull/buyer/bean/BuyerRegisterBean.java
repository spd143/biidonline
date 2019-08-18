package com.techskull.buyer.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

public class BuyerRegisterBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long regId;
	
	@NotNull
	private String city;
	
	
	private String country;
	private String countryCode;
	private String email;
	private String firstName;
	private String flatBlockNo;
	private String landmark;
	private String lastName;
	private String middleName;
	private String password;
	private String pincode;
	private String stateUnionTerritory;
	private String streetName;
	private String username;

	// optional

	private String conPassword;

	public Long getRegId() {
		return regId;
	}

	public void setRegId(Long regId) {
		this.regId = regId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFlatBlockNo() {
		return flatBlockNo;
	}

	public void setFlatBlockNo(String flatBlockNo) {
		this.flatBlockNo = flatBlockNo;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getStateUnionTerritory() {
		return stateUnionTerritory;
	}

	public void setStateUnionTerritory(String stateUnionTerritory) {
		this.stateUnionTerritory = stateUnionTerritory;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getConPassword() {
		return conPassword;
	}

	public void setConPassword(String conPassword) {
		this.conPassword = conPassword;
	}

}
