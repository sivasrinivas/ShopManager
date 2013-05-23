package com.sivasrinivas.ShopManager.dao.impl;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.sivasrinivas.ShopManager.dao.UserDAO;
import com.sivasrinivas.ShopManager.model.UserModel;

public class UserDAOImpl implements UserDAO {
	
	private MongoOperations mongoOperations;

	@Override
	public String getPasswordByEmailId(String emailId) {
		System.out.println("Querying database");
		Query query = new Query(Criteria.where("emailId").is(emailId));
		UserModel user = mongoOperations.findOne(query, UserModel.class);
		if(user!=null)
			return user.getPassword();
		else 
			return null;
	
	}

	@Override
	public void saveOrUpdate(UserModel user) {
		mongoOperations.save(user);
	}
	
	@Override
	public void insert(UserModel user) {
		System.out.println("in userDAOImpl inserting user model");
		mongoOperations.insert(user);
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
