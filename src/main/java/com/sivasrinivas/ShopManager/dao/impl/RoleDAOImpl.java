package com.sivasrinivas.ShopManager.dao.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.sivasrinivas.ShopManager.dao.RoleDAO;
import com.sivasrinivas.ShopManager.model.RoleModel;

public class RoleDAOImpl implements RoleDAO {
	private MongoTemplate mongoTemplate;
	
	@Override
	public void insert(RoleModel role) {
		mongoTemplate.insert(role);
	}

	@Override
	public void remove(RoleModel role) {
		
	}
	
	@Override
	public RoleModel findById(RoleModel role){
		return mongoTemplate.findById(role.getId(), RoleModel.class);
	}
	
	@Override
	public Collection<String> getNames() {
		Collection<String> names = new ArrayList<String>();
		Query q = new Query();
		q.fields().include("name");
		List<RoleModel> list = mongoTemplate.find(q, RoleModel.class);
		for(RoleModel role : list)
			names.add(role.getName());
		return names;
	}
	
	@Override
	public List<RoleModel> getList(){
		return mongoTemplate.findAll(RoleModel.class);
	}
	
	@Override
	public void removeByName(String roleName){
		Query q = new Query();
		q.addCriteria(Criteria.where("name").is(roleName));
		mongoTemplate.remove(q, RoleModel.class);
	}

	/**
	 * @return the mongoTempate
	 */
	public MongoTemplate getMongoTemplate() {
		return mongoTemplate;
	}

	/**
	 * @param mongoTempate the mongoTempate to set
	 */
	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

}
