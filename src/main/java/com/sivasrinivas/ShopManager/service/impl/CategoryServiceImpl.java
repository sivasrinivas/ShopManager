package com.sivasrinivas.ShopManager.service.impl;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.sivasrinivas.ShopManager.model.CategoryModel;
import com.sivasrinivas.ShopManager.service.CategoryService;

@Repository
public class CategoryServiceImpl implements CategoryService{
	private ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	private MongoOperations mongoTemplate = (MongoOperations) context.getBean("mongoTemplate");
	public static final String COLLECTION = "category";
	/**
	 * adds a new category to the Category collection
	 */
	@Override
	public void addCategory(CategoryModel category) {
		if(!mongoTemplate.collectionExists(CategoryModel.class))
			mongoTemplate.createCollection(CategoryModel.class);
		mongoTemplate.insert(category, COLLECTION);
	}
	
	/**
	 * updates existing category details
	 */
	@Override
	public void updateCategory(CategoryModel category) {
		mongoTemplate.insert(category, COLLECTION);
	}
	/**
	 * delete existing category
	 */
	@Override
	public void deleteCategory(CategoryModel category) {
		mongoTemplate.remove(category);
	}
	/**
	 * gets all existing categories list
	 */
	@Override
	public Collection<CategoryModel> getCategoryList() {
		return mongoTemplate.findAll(CategoryModel.class, COLLECTION) ;
	}

}
