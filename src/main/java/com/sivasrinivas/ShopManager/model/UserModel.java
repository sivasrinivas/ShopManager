package com.sivasrinivas.ShopManager.model;

import java.util.Map;
import java.util.Set;

import org.bson.BSONObject;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.DBObject;
@Document(collection= "users")
public class UserModel {
	
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private long uid;
	private String userId;
	private String emailId;
	private String password;
	
	public long getUid() {
		return uid;
	}
	public void setUid(long uid) {
		this.uid = uid;
	}
	public void setId(String id) {
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
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
