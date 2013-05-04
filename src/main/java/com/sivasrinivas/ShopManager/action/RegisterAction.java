package com.sivasrinivas.ShopManager.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.sivasrinivas.ShopManager.model.UserModel;
import com.sivasrinivas.ShopManager.service.MongoService;
import com.sivasrinivas.ShopManager.service.SpringMongoConfig;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2576055902932974408L;
	
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
	
	public String execute(){
		
		// For Annotation
		ApplicationContext ctx = 
	             new AnnotationConfigApplicationContext(SpringMongoConfig.class);
		MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
	 
		// save
		mongoOperation.save(getUser());
	 
		// now user object got the created id.
		System.out.println("1. user : " + getUser().getUserId());
	 
		// query to search user
		Query searchUserQuery = new Query(Criteria.where("userId").is("test"));
	 
		// find the saved user again.
		UserModel savedUser = mongoOperation.findOne(searchUserQuery, UserModel.class);
		System.out.println("2. find - savedUser : " + savedUser.getUserId());
		
		return SUCCESS;
	}
	
	
}
