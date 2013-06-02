package com.sivasrinivas.ShopManager.dao.impl;

import org.springframework.data.mongodb.core.MongoTemplate;

import com.sivasrinivas.ShopManager.dao.RoleDAO;
import com.sivasrinivas.ShopManager.model.RoleModel;

public class RoleDAOImpl implements RoleDAO {
	private MongoTemplate mongoTemplate;
	
	@Override
	public void insert(RoleModel role) {
		mongoTemplate.insert(role);
	}

	@Override
	public void remove(RoleModel role) {
		// TODO Auto-generated method stub

	}

	/**
	 * @return the mongoTempate
	 */
	public MongoTemplate getMongoTemplate() {
		return mongoTemplate;
	}

	/**
	 * @param mongoTempate the mongoTempate to set
	 */
	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

}
