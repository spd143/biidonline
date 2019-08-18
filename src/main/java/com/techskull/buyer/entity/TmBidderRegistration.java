package com.techskull.buyer.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the tm_bidder_registration database table.
 * 
 */
@Entity
@Table(name="tm_bidder_registration")
@NamedQuery(name="TmBidderRegistration.findAll", query="SELECT t FROM TmBidderRegistration t")
public class TmBidderRegistration implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="reg_id")
	private Long regId;

	@Column(name="city")
	private String city;

	@Column(name="country")
	private String country;

	@Column(name="country_code")
	private String countryCode;

	@Column(name="email")
	private String email;

	@Column(name="first_name")
	private String firstName;

	@Column(name="flat_block_no")
	private String flatBlockNo;

	@Column(name="landmark")
	private String landmark;

	@Column(name="last_name")
	private String lastName;

	@Column(name="middle_name")
	private String middleName;

	@Column(name="password")
	private String password;

	@Column(name="pincode")
	private String pincode;

	@Column(name="state_union_territory")
	private String stateUnionTerritory;

	@Column(name="street_name")
	private String streetName;

	@Column(name="username")
	private String username;

	public Long getRegId() {
		return this.regId;
	}

	public void setRegId(Long regId) {
		this.regId = regId;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFlatBlockNo() {
		return this.flatBlockNo;
	}

	public void setFlatBlockNo(String flatBlockNo) {
		this.flatBlockNo = flatBlockNo;
	}

	public String getLandmark() {
		return this.landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPincode() {
		return this.pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getStateUnionTerritory() {
		return this.stateUnionTerritory;
	}

	public void setStateUnionTerritory(String stateUnionTerritory) {
		this.stateUnionTerritory = stateUnionTerritory;
	}

	public String getStreetName() {
		return this.streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}