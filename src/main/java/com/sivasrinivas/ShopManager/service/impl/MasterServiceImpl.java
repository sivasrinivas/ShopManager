package com.sivasrinivas.ShopManager.service.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.sivasrinivas.ShopManager.service.MasterService;

@Service
public class MasterServiceImpl implements MasterService {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Override
	public <T> T findById(Object id, Class<T> entityClass) {
		T document = mongoTemplate.findById(id, entityClass);
		return document;
	}

	@Override
	public <T> List<T> findAll(Class<T> entityClass) {
		List<T> list=mongoTemplate.findAll(entityClass);
		return list;
	}

}
