/**
 * 
 */
package com.sivasrinivas.ShopManager.dao.impl;

import java.util.List;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.sivasrinivas.ShopManager.dao.MasterDAO;

/**
 * @author Siva
 *
 */
@Repository
public class MasterDAOImpl implements MasterDAO {

	private MongoTemplate mongoTemplate;
	
	@Override
	public <T> List<? extends Object> findAll(Class<?> modelClass){
		return mongoTemplate.findAll(modelClass);
	}
	
	@Override
	public void deprecate(Object modelObjectToDeprecate) {
		
	}

	/* (non-Javadoc)
	 * @see com.sivasrinivas.ShopManager.dao.CommonDAO#deprecate(java.lang.Object, java.lang.String)
	 */
	@Override
	public void deprecate(Object modelObjectToDeprecate, String collectionName) {
		
	}

	/* (non-Javadoc)
	 * @see com.sivasrinivas.ShopManager.dao.CommonDAO#remove(java.lang.Object)
	 */
	@Override
	public void remove(Object modelObjectToRemove) {
		mongoTemplate.remove(modelObjectToRemove);
	}

	@Override
	public void remove(Object modelObjectToRemove, String collectionName) {
		mongoTemplate.remove(modelObjectToRemove, collectionName);
	}

	/* (non-Javadoc)
	 * @see com.sivasrinivas.ShopManager.dao.CommonDAO#save(java.lang.Object)
	 */
	@Override
	public void save(Object modelObjectToSave) {
		mongoTemplate.save(modelObjectToSave);
	}

	/* (non-Javadoc)
	 * @see com.sivasrinivas.ShopManager.dao.CommonDAO#save(java.lang.Object, java.lang.String)
	 */
	@Override
	public void save(Object modelObjectToSave, String collectionName) {
		mongoTemplate.save(modelObjectToSave, collectionName);
	}

	/**
	 * @return the mongoTemplate
	 */
	public MongoTemplate getMongoTemplate() {
		return mongoTemplate;
	}

	/**
	 * @param mongoTemplate the mongoTemplate to set
	 */
	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

}
