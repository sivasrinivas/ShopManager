package com.sivasrinivas.ShopManager.action;

import com.sivasrinivas.ShopManager.model.UserModel;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	
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
		
		return SUCCESS;
	}

}
