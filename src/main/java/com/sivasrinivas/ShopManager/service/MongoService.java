package com.sivasrinivas.ShopManager.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;

public class MongoService {
	private static final ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringMongoConfig.class);
	private static final MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
	
	public static MongoOperations getMongoOperation(){
		return mongoOperation;
	}
	
}
