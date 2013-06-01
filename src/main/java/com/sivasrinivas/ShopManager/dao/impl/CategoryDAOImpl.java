package com.sivasrinivas.ShopManager.dao.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.sivasrinivas.ShopManager.dao.CategoryDAO;
import com.sivasrinivas.ShopManager.model.CategoryModel;

public class CategoryDAOImpl implements CategoryDAO{

	private static Logger logger = Logger.getLogger(CategoryDAOImpl.class);
	private MongoTemplate mongoTemplate;
	
	@Override
	public Collection<CategoryModel> getAllDocuments() {
		return mongoTemplate.findAll(CategoryModel.class);
	}

	@Override
	public List<String> getCategoryNames() {
		Collection<CategoryModel> categoryList = getAllDocuments();
		List<String> categoryNames = new ArrayList<String>();
		Iterator<CategoryModel> ite = categoryList.iterator();
		while(ite.hasNext()){
			categoryNames.add(ite.next().getName());
		}
		return categoryNames;
	}
	
	/**
	 * adds a new category to the Category collection
	 */
	@Override
	public void insert(CategoryModel category) {
		logger.info("adding a category to collection category.");
		category.setId(UUID.randomUUID().toString());
		mongoTemplate.insert(category);
	}
	
	/**
	 * updates existing category details
	 */
	@Override
	public void saveOrUpdate(CategoryModel category) {
		//mongoOperations.
	}
	/**
	 * delete existing category
	 */
	@Override
	public void remove(CategoryModel category) {
		mongoTemplate.remove(category);
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
