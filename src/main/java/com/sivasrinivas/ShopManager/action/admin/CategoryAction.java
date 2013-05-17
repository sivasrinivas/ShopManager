/**
 * 
 */
package com.sivasrinivas.ShopManager.action.admin;

import java.util.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.opensymphony.xwork2.ActionSupport;
import com.sivasrinivas.ShopManager.model.CategoryModel;
import com.sivasrinivas.ShopManager.service.CategoryService;

/**
 * @author Siva
 *
 */
public class CategoryAction extends ActionSupport{

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
		categoryList = categoryService.getCategoryList();
		System.out.println(categoryList.size());
		return "addCategorySetup";
	}
	
	public String addCategory(){
			categoryService.addCategory(category);
			System.out.println("Category added successfully.");
			addActionMessage("Category added successfully.");
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
