package com.sivasrinivas.ShopManager.service.impl;
import java.util.Collection;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

import com.sivasrinivas.ShopManager.model.CategoryModel;
import com.sivasrinivas.ShopManager.service.CategoryService;

@Repository
public class CategoryServiceImpl implements CategoryService{
	static Logger logger = Logger.getLogger(CategoryServiceImpl.class);
	
	private MongoOperations mongoOperations;
	/**
	 * adds a new category to the Category collection
	 */
	@Override
	public void addCategory(CategoryModel category) {
		logger.info("adding a category to collection category.");
		category.setId(UUID.randomUUID().toString());
		mongoOperations.insert(category);
	}
	
	/**
	 * updates existing category details
	 */
	@Override
	public void updateCategory(CategoryModel category) {
		mongoOperations.save(category);
	}
	/**
	 * delete existing category
	 */
	@Override
	public void deleteCategory(CategoryModel category) {
		mongoOperations.remove(category);
	}
	/**
	 * gets all existing categories list
	 */
	@Override
	public Collection<CategoryModel> getCategoryList() {
		return mongoOperations.findAll(CategoryModel.class);
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
