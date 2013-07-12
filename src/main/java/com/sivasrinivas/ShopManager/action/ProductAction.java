package com.sivasrinivas.ShopManager.action;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.sivasrinivas.ShopManager.model.CategoryModel;
import com.sivasrinivas.ShopManager.model.ProductModel;
import com.sivasrinivas.ShopManager.service.MasterService;
import com.sivasrinivas.ShopManager.service.admin.CategoryService;
import com.sivasrinivas.ShopManager.service.admin.ProductService;

@Component("ProductAction")
public class ProductAction extends ActionSupport{
	static Logger logger = Logger.getLogger(ProductAction.class);
	/**
	 * generated serial version id
	 */
	private static final long serialVersionUID = 3636674307392727439L;
	/* getting application context and then mongoOperations*/
//	ApplicationContext ctx = new GenericXmlApplicationContext("spring.xml");
//	ProductService productService = (ProductService)ctx.getBean("productService");
//	MasterService masterService = (MasterService)ctx.getBean("masterService");
	
	private @Autowired ProductService productService;
	private @Autowired MasterService masterService;
	
	private ProductModel product;
	private BigDecimal prodId;
	
	public String show(){
		String result="show";
		product = masterService.findById(product.getId(), ProductModel.class);
		return result;
	}
	
	/*
	 * Getters and Setters
	 */

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

	/**
	 * @return the prodId
	 */
	public BigDecimal getProdId() {
		return prodId;
	}

	/**
	 * @param prodId the prodId to set
	 */
	public void setProdId(BigDecimal prodId) {
		this.prodId = prodId;
	}
}
