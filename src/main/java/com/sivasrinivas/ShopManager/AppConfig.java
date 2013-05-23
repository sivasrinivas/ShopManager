package com.sivasrinivas.ShopManager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoFactoryBean;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class AppConfig {
	/*
     * Factory bean that creates the com.mongodb.Mongo instance
     */
     public @Bean MongoFactoryBean mongo() {
          MongoFactoryBean mongo = new MongoFactoryBean();
          mongo.setHost("localhost");
          return mongo;
     }
     
//     public @Bean MongoTemplate mongoTemplate() throws Exception {
//         return new MongoTemplate(mongo(), "shop");
//     }
}
