package com.sivasrinivas.ShopManager.dao;

import com.sivasrinivas.ShopManager.model.UserModel;

public interface UserDAO {

	public String getPasswordByEmailId(String emailId);
	public void saveOrUpdate(UserModel user);
	public void insert(UserModel user);
	
}
