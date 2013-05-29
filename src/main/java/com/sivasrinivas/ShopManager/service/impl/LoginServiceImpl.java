package com.sivasrinivas.ShopManager.service.impl;

import com.sivasrinivas.ShopManager.dao.AdminDAO;
import com.sivasrinivas.ShopManager.dao.UserDAO;
import com.sivasrinivas.ShopManager.model.AdminModel;
import com.sivasrinivas.ShopManager.model.UserModel;
import com.sivasrinivas.ShopManager.service.LoginService;

public class LoginServiceImpl implements LoginService {

	private UserDAO userDAO;
	private AdminDAO adminDAO;
	
	@Override
	public boolean verifyPassword(UserModel user) {
		String password = userDAO.getPasswordByEmailId(user.getEmailId());
		
		if(user.getPassword().equals(password)){
			return true;
		}
		return false;
	}

	@Override
	public boolean verifyPassword(AdminModel admin) {
		String password = adminDAO.getPasswordByEmailId(admin.getEmailId());
		
		if(admin.getPassword().equals(password)){
			return true;
		}
		return false;
	}
	
	/**
	 * @return the userDAO
	 */
	public UserDAO getUserDAO() {
		return userDAO;
	}

	/**
	 * @param userDAO the userDAO to set
	 */
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	/**
	 * @return the adminDAO
	 */
	public AdminDAO getAdminDAO() {
		return adminDAO;
	}

	/**
	 * @param adminDAO the adminDAO to set
	 */
	public void setAdminDAO(AdminDAO adminDAO) {
		this.adminDAO = adminDAO;
	}


}
