package com.sivasrinivas.ShopManager.action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.sivasrinivas.ShopManager.model.UserModel;
import com.sivasrinivas.ShopManager.service.MongoService;
import com.opensymphony.xwork2.ActionSupport;

public class AccountAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2576055902932974408L;
	static Logger logger = LogManager.getLogger(LoginAction.class.getName());
	
	private UserModel user;
	private String confPassword;
	
	public UserModel getUser() {
		return user;
	}
	public void setUser(UserModel user) {
		this.user = user;
	}
	public String getConfPassword() {
		return confPassword;
	}
	public void setConfPassword(String confPassword) {
		this.confPassword = confPassword;
	}
	
	public String register(){
		
		MongoOperations mongoOperation = MongoService.getMongoOperation();
	 
		// save
		mongoOperation.save(getUser());
		
		return SUCCESS;
	}
	
	public String login(){
		MongoOperations mongoOperation = MongoService.getMongoOperation();
		// query to search user
		Query searchUserQuery = new Query(Criteria.where("userId").is(getUser().getUserId()));
	 
		// find the saved user again.
		UserModel savedUser = mongoOperation.findOne(searchUserQuery, UserModel.class);
		
		if(savedUser.getPassword().equals(getUser().getPassword()))
			return SUCCESS;
		
		addActionError("User Id or Password is incorrect");
		logger.error("Login failed for user : "+getUser().getUserId());
		return "loginfail";
	}
	
	
}
