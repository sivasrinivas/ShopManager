package com.sivasrinivas.ShopManager.action.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionSupport;
import com.sivasrinivas.ShopManager.model.UserModel;
import com.sivasrinivas.ShopManager.service.SignupService;

public class SignupAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6184362413438031532L;
	
	private ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	private SignupService signupService = (SignupService) context.getBean("signupService");
	
	private UserModel user;
	private String confPassword;
	
	public String createAccount(){
		if(user.getPassword().equals(confPassword)){
			System.out.println("in action - create account");
			signupService.createAccount(user);
			return SUCCESS;
		}
		else 
			return ERROR;
			
		
	}

	/**
	 * @return the user
	 */
	public UserModel getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(UserModel user) {
		this.user = user;
	}

	//Getters and Setters
	/**
	 * @return the confPassword
	 */
	public String getConfPassword() {
		return confPassword;
	}

	/**
	 * @param confPassword the confPassword to set
	 */
	public void setConfPassword(String confPassword) {
		this.confPassword = confPassword;
	}

}
