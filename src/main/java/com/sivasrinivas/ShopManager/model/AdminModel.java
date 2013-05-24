package com.sivasrinivas.ShopManager.model;

import java.math.BigInteger;
import java.util.Map;
import java.util.Set;

import org.bson.BSONObject;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "admins")
public class AdminModel {
	
	@Id 
	BigInteger id;
	String firstName;
	String middleName;
	String lastName;
	String userId;
	String emailId;
	String password;
	String phoneNumber;
	
	public void setId(BigInteger id) {
		this.id = id;
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
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}
	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the id
	 */
	public BigInteger getId() {
		return id;
	}
	public boolean containsField(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Deprecated
	public boolean containsKey(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	public Object get(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	public Set<String> keySet() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object put(String arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}
	public void putAll(BSONObject arg0) {
		// TODO Auto-generated method stub
		
	}
	public void putAll(Map arg0) {
		// TODO Auto-generated method stub
		
	}
	public Object removeField(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	public Map toMap() {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean isPartialObject() {
		// TODO Auto-generated method stub
		return false;
	}
	public void markAsPartialObject() {
		// TODO Auto-generated method stub
		
	}
	
	
}
