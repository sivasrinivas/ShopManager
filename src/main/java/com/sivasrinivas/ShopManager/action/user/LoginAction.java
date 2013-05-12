package com.sivasrinivas.ShopManager.action.user;

import org.springframework.context.ApplicationContext;

import com.opensymphony.xwork2.ActionSupport;
import com.sivasrinivas.ShopManager.service.MainService;

public class LoginAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6025733989482587432L;
	
	private ApplicationContext context = MainService.getApplicationContext();
	
	public String execute(){
		return "login";
	}
}
