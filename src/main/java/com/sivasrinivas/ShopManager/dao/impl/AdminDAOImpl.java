package com.sivasrinivas.ShopManager.dao.impl;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.sivasrinivas.ShopManager.dao.AdminDAO;
import com.sivasrinivas.ShopManager.dao.UserDAO;
import com.sivasrinivas.ShopManager.model.AdminModel;
import com.sivasrinivas.ShopManager.model.UserModel;

public class AdminDAOImpl implements AdminDAO {
	
	private MongoOperations mongoOperations;

	@Override
	public String getPasswordByEmailId(String emailId) {
		System.out.println("Querying database");
		Query query = new Query(Criteria.where("emailId").is(emailId));
		AdminModel admin = mongoOperations.findOne(query, AdminModel.class);
		if(admin!=null)
			return admin.getPassword();
		else 
			return null;
	
	}

	@Override
	public void saveOrUpdate(AdminModel admin) {
		mongoOperations.save(admin);
	}
	
	@Override
	public void insert(AdminModel admin) {
		System.out.println("in userDAOImpl inserting user model");
		mongoOperations.insert(admin);
	}
	
	//Getters and Setters
	/**
	 * @return the mongoTemplate
	 */
	public MongoOperations getMongoTemplate() {
		return mongoOperations;
	}

	/**
	 * @param mongoTemplate the mongoTemplate to set
	 */
	public void setMongoTemplate(MongoOperations mongoOperations) {
		this.mongoOperations = mongoOperations;
	}


}
