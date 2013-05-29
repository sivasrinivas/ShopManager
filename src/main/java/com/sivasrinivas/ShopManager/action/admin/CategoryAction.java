/**
 * 
 */
package com.sivasrinivas.ShopManager.action.admin;

import java.util.Collection;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.opensymphony.xwork2.ActionSupport;
import com.sivasrinivas.ShopManager.model.CategoryModel;
import com.sivasrinivas.ShopManager.service.admin.CategoryService;

/**
 * @author Siva
 *
 */
public class CategoryAction extends ActionSupport{
	static Logger logger = Logger.getLogger(CategoryAction.class);

	/**
	 * Generated serial version UID
	 */
	private static final long serialVersionUID = -7015399379262262506L;
	/* getting application context and then mongoOperations*/
	ApplicationContext ctx = new GenericXmlApplicationContext("spring.xml");
	CategoryService categoryService = (CategoryService)ctx.getBean("CategoryService");

	private CategoryModel category;
	private Collection<CategoryModel> categoryList;
	
	
	/**
	 *default return to setup add category form page 
	 * @return
	 */
	public String addCategorySetup(){
		logger.trace("getting existing category list.");
		categoryList = categoryService.getCategoryList();
		return "addCategorySetup";
	}
	
	public String addCategory(){
		logger.trace("addCategory action method called.");
		categoryService.addCategory(category);
		addCategorySetup();
		return SUCCESS;
	}
	
	//Getters and Setters
	/**
	 * @return the category
	 */
	public CategoryModel getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(CategoryModel category) {
		this.category = category;
	}
	public String execute(){
		return SUCCESS;
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
}
