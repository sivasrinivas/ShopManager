package com.sivasrinivas.ShopManager.model;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="address")
public class AddressModel {
	@Id
	private BigInteger id;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private int zip1;
	private int zip2;
	/**
	 * @return the id
	 */
	public BigInteger getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(BigInteger id) {
		this.id = id;
	}
	/**
	 * @return the address1
	 */
	public String getAddress1() {
		return address1;
	}
	/**
	 * @param address1 the address1 to set
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	/**
	 * @return the address2
	 */
	public String getAddress2() {
		return address2;
	}
	/**
	 * @param address2 the address2 to set
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the zip1
	 */
	public int getZip1() {
		return zip1;
	}
	/**
	 * @param zip1 the zip1 to set
	 */
	public void setZip1(int zip1) {
		this.zip1 = zip1;
	}
	/**
	 * @return the zip2
	 */
	public int getZip2() {
		return zip2;
	}
	/**
	 * @param zip2 the zip2 to set
	 */
	public void setZip2(int zip2) {
		this.zip2 = zip2;
	}
}
