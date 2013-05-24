package com.sivasrinivas.ShopManager.service;

import com.sivasrinivas.ShopManager.model.AdminModel;
import com.sivasrinivas.ShopManager.model.UserModel;

public interface LoginService {

	public boolean verifyPassword(UserModel user);
	public boolean verifyPassword(AdminModel admin);
}
