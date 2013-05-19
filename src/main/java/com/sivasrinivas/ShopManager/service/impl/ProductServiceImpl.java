package com.sivasrinivas.ShopManager.service.impl;

import java.util.Collection;

import org.apache.log4j.Logger;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.sivasrinivas.ShopManager.model.ProductModel;
import com.sivasrinivas.ShopManager.service.ProductService;

public class ProductServiceImpl implements ProductService{
	static Logger logger = Logger.getLogger(ProductServiceImpl.class) ;
	private MongoTemplate mongoTemplate;
	private MongoOperations mongoOperations;
	
	@Override
	public void insertProduct(ProductModel product) {
		logger.info("Inserting product into product collection.");
		//mongoTemplate.insert(product);
		mongoOperations.insert(product);
	}

	@Override
	public void updateProduct(ProductModel product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertOrUpdate(ProductModel product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProduct(ProductModel product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<ProductModel> getProcutList() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * Getters and Setters of the variables
	 */
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
