package com.sivasrinivas.ShopManager.action;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionSupport;
import com.sivasrinivas.ShopManager.model.ProductModel;
import com.sivasrinivas.ShopManager.model.UserModel;
import com.sivasrinivas.ShopManager.service.LoginService;
import com.sivasrinivas.ShopManager.service.MasterService;
/*
 * Action for user log into his account
 */
public class WelcomeAction extends ActionSupport{
	/**
	 * generated version id of the class
	 */
	private static final long serialVersionUID = 6025733989482587432L;
	
	private ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	private MasterService masterService = (MasterService)context.getBean("masterService");

	private List<ProductModel> productList;
	
	public String execute(){
		productList = masterService.findAll(ProductModel.class);
		return SUCCESS;
	}

	/**
	 * @return the productList
	 */
	public List<ProductModel> getProductList() {
		return productList;
	}

	/**
	 * @param productList the productList to set
	 */
	public void setProductList(List<ProductModel> productList) {
		this.productList = productList;
	}
	
}
