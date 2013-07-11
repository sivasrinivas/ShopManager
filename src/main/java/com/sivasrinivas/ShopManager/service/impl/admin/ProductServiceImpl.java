package com.sivasrinivas.ShopManager.service.impl.admin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.Collection;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.stereotype.Repository;

import com.sivasrinivas.ShopManager.model.ProductModel;
import com.sivasrinivas.ShopManager.service.admin.ProductService;

@Repository
public class ProductServiceImpl implements ProductService{
	static Logger logger = Logger.getLogger(ProductServiceImpl.class) ;
	private MongoOperations mongoOperations;
	@Autowired	private GridFsTemplate gridFsTemplate;
	private InputStream inputStream = null;
	
	/*
	 * Adds a product to the product collection
	 * @see com.sivasrinivas.ShopManager.service.ProductService#insertProduct(com.sivasrinivas.ShopManager.model.ProductModel)
	 */
	@Override
	public void insertProduct(ProductModel product) {
		logger.info("Inserting product into product collection.");
		try {
			System.out.println(product.getImage());
			inputStream = new FileInputStream(product.getImage());
			gridFsTemplate.store(inputStream, "image", product);
			mongoOperations.insert(product);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
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
