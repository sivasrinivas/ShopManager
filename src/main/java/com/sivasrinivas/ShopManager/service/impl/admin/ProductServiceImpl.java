package com.sivasrinivas.ShopManager.service.impl.admin;

import java.math.BigInteger;
import java.util.Collection;

import org.apache.log4j.Logger;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

import com.sivasrinivas.ShopManager.model.ProductModel;
import com.sivasrinivas.ShopManager.service.admin.ProductService;

@Repository
public class ProductServiceImpl implements ProductService{
	static Logger logger = Logger.getLogger(ProductServiceImpl.class) ;
	private MongoOperations mongoOperations;
	
	/*
	 * Adds a product to the product collection
	 * @see com.sivasrinivas.ShopManager.service.ProductService#insertProduct(com.sivasrinivas.ShopManager.model.ProductModel)
	 */
	@Override
	public void insertProduct(ProductModel product) {
		logger.info("Inserting product into product collection.");
		System.out.println("inserting product into collection");
		product.setSKU(new BigInteger("123"));
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
		Collection<ProductModel> collection = mongoOperations.findAll(ProductModel.class);
		return collection;
	}

	/*
	 * Getters and Setters of the variables
	 */
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
