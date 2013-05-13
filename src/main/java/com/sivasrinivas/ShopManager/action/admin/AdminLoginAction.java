package com.sivasrinivas.ShopManager.action.admin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionSupport;
import com.sivasrinivas.ShopManager.service.LoginService;

public class AdminLoginAction extends ActionSupport{
	/**
	 * generated version id of the class
	 */
	private static final long serialVersionUID = 6025733989482587432L;
	private ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
	private LoginService loginService = (LoginService) context.getBean("LoginService");
	private String emailId;
	private String password;
	
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute(){
		return "login";
	}
	
	public String login(){
			boolean loginRes = loginService.validate(emailId, password);
			if(loginRes)
				return SUCCESS;
			else
				return ERROR;
	}
}
