package com.sivasrinivas.ShopManager.action.admin;

import java.util.Collection;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.opensymphony.xwork2.ActionSupport;
import com.sivasrinivas.ShopManager.model.ProductModel;
import com.sivasrinivas.ShopManager.service.ProductService;

public class ProductAction extends ActionSupport{
	static Logger logger = Logger.getLogger(ProductAction.class);
	/**
	 * generated serial version id
	 */
	private static final long serialVersionUID = 3636674307392727439L;
	/* getting application context and then mongoOperations*/
	ApplicationContext ctx = new GenericXmlApplicationContext("spring.xml");
	ProductService productService = (ProductService)ctx.getBean("ProductService");
	
	private Collection<ProductModel> productList;
	private ProductModel product;
	
	/* add product setup page*/
	public String addProduct(){
		String result = "addProduct";
		productList = productService.getProcutList(); 
		return result;
	}
	
	public String insertProduct(){
		String result = "insertProduct";
		productService.insertProduct(product);
		return result;
	}
	
	/*
	 * Getters and Setters
	 */

	/**
	 * @return the productList
	 */
	public Collection<ProductModel> getProductList() {
		return productList;
	}

	/**
	 * @param productList the productList to set
	 */
	public void setProductList(Collection<ProductModel> productList) {
		this.productList = productList;
	}

	/**
	 * @return the product
	 */
	public ProductModel getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(ProductModel product) {
		this.product = product;
	}
}
