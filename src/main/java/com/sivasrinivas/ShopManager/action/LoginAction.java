package com.sivasrinivas.ShopManager.action;

import com.sivasrinivas.ShopManager.model.UserModel;
import com.opensymphony.xwork2.ActionSupport;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginAction extends ActionSupport{
	static Logger logger = LogManager.getLogger(LoginAction.class.getName());
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserModel user;
	
	public UserModel getUser() {
		return user;
	}

	public void setUser(UserModel user) {
		this.user = user;
	}

	public String execute(){
		System.out.println(user.getUserId());
		System.out.println(user.getPassword());
		logger.trace("executed");
		return SUCCESS;
	}

}
