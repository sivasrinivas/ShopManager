package com.sivasrinivas.ShopManager.service.impl;

import com.sivasrinivas.ShopManager.dao.UserDAO;
import com.sivasrinivas.ShopManager.model.UserModel;
import com.sivasrinivas.ShopManager.service.SignupService;

public class SignupServiceImpl implements SignupService {

	private UserDAO userDAO;
	
	@Override
	public void createAccount(UserModel user) {
		System.out.println("in SignupServiceImpl createAccount method");
		userDAO.insert(user);
		return;
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
