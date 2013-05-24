package com.sivasrinivas.ShopManager.dao;

import com.sivasrinivas.ShopManager.model.AdminModel;

public interface AdminDAO {

	public String getPasswordByEmailId(String emailId);
	public void saveOrUpdate(AdminModel user);
	public void insert(AdminModel user);
	
}
