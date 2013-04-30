package com.sivasrinivas.ShopManager.action;

import com.sivasrinivas.ShopManager.model.UserModel;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport{

	private UserModel user;
	public UserModel getUser() {
		return user;
	}
	public void setUser(UserModel user) {
		this.user = user;
	}
	public String getConfPassword() {
		return confPassword;
	}
	public void setConfPassword(String confPassword) {
		this.confPassword = confPassword;
	}
	private String confPassword;
	
}
