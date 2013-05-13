package com.sivasrinivas.ShopManager.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.data.mongodb.core.MongoOperations;

public class MainService implements ApplicationContextAware {
	private static ApplicationContext context;
	
	public static ApplicationContext getApplicationContext (){
		return context;
	}
	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		MainService.context = context;
	}

	public MongoOperations getMongoOperation(){
		MongoOperations mongo = (MongoOperations) context.getBean("mongotemplate");
		return mongo;
	}
	
}
