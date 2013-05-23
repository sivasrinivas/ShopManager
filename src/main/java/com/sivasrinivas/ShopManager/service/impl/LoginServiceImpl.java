package com.sivasrinivas.ShopManager.service.impl;

import com.sivasrinivas.ShopManager.dao.UserDAO;
import com.sivasrinivas.ShopManager.model.UserModel;
import com.sivasrinivas.ShopManager.service.LoginService;

public class LoginServiceImpl implements LoginService {

	private UserDAO userDAO;
	
	@Override
	public boolean verifyPassword(UserModel user) {
		System.out.println("user from form - "+user.getEmailId());
		String password = userDAO.getPasswordByEmailId(user.getEmailId());
		System.out.println("Entered password - "+user.getPassword());
		System.out.println("Password from db - "+password);
		
		if(user.getPassword().equals(password)){
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
	
	

}
