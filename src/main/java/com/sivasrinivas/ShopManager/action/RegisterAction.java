package com.sivasrinivas.ShopManager.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sivasrinivas.ShopManager.model.UserModel;
import com.sivasrinivas.ShopManager.service.MongoService;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport{

	
	
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
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");

		MongoService mongo = (MongoService) context.getBean("MongoService");
		DB db = mongo.getDB();
		
		DBCollection userCol = db.getCollection("users");
		BasicDBObject doc = new BasicDBObject();
		doc.put(user.getUserId(), user);
		userCol.insert(doc);
		
		DBCursor cursor = userCol.find(doc);
		while(cursor.hasNext()){
			System.out.println(cursor.next());
		}
		
		return SUCCESS;
	}
	
	
}
