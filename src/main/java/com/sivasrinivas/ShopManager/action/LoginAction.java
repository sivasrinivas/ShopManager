package com.sivasrinivas.ShopManager.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionSupport;
import com.sivasrinivas.ShopManager.model.UserModel;
import com.sivasrinivas.ShopManager.service.LoginService;
/*
 * Action for user log into his account
 */
public class LoginAction extends ActionSupport{
	/**
	 * generated version id of the class
	 */
	private static final long serialVersionUID = 6025733989482587432L;
	
	private ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	private LoginService loginService = (LoginService) context.getBean("loginService");
	
	private UserModel user;
	
	public UserModel getUser() {
		return this.user;
	}

	public void setUser(UserModel user) {
		this.user = user;
	}

	public String execute(){
		return "login";
	}
	
	public String login(){
			boolean loginRes = loginService.verifyPassword(user);
			if(loginRes)
				return SUCCESS;
			else
				return ERROR;
	}
}
