package com.sivasrinivas.ShopManager.action.admin;

import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.opensymphony.xwork2.ActionSupport;
import com.sivasrinivas.ShopManager.model.CategoryModel;
import com.sivasrinivas.ShopManager.model.ProductModel;
import com.sivasrinivas.ShopManager.service.admin.CategoryService;
import com.sivasrinivas.ShopManager.service.admin.ProductService;

public class ProductAction extends ActionSupport{
	static Logger logger = Logger.getLogger(ProductAction.class);
	/**
	 * generated serial version id
	 */
	private static final long serialVersionUID = 3636674307392727439L;
	/* getting application context and then mongoOperations*/
	ApplicationContext ctx = new GenericXmlApplicationContext("spring.xml");
	ProductService productService = (ProductService)ctx.getBean("productService");
	CategoryService categoryService = (CategoryService)ctx.getBean("categoryService");
	
	private Collection<ProductModel> productList;
	private Collection<CategoryModel> categoryList;
	private List<String> categoryNames;
	private ProductModel product;
	
	/* add product setup page*/
	public String addProduct(){
		String result = "addProduct";
		productList = productService.getProcutList();
		categoryNames = categoryService.getCategoryNames();
		return result;
	}
	
	public String insertProduct(){
		System.out.println("AddProduct action called.");
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

	/**
	 * @return the categoryList
	 */
	public Collection<CategoryModel> getCategoryList() {
		return categoryList;
	}

	/**
	 * @param categoryList the categoryList to set
	 */
	public void setCategoryList(Collection<CategoryModel> categoryList) {
		this.categoryList = categoryList;
	}

	/**
	 * @return the categoryNames
	 */
	public List<String> getCategoryNames() {
		return categoryNames;
	}

	/**
	 * @param categoryNames the categoryNames to set
	 */
	public void setCategoryNames(List<String> categoryNames) {
		this.categoryNames = categoryNames;
	}
}
