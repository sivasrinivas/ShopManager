/**
 * 
 */
package com.sivasrinivas.ShopManager.action.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionSupport;
import com.sivasrinivas.ShopManager.model.CategoryModel;
import com.sivasrinivas.ShopManager.service.CategoryService;
import com.sivasrinivas.ShopManager.service.LoginService;

/**
 * @author Siva
 *
 */
public class CategoryAction extends ActionSupport{

	/**
	 * Generated serial version UID
	 */
	private static final long serialVersionUID = -7015399379262262506L;
//	private ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//	private CategoryService categoryService = (CategoryService) context.getBean("CategoryService");
	private CategoryModel category;
	
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
	 *default return to setup add category form page 
	 * @return
	 */
	public String addCategorySetup(){
		return "addCategorySetup";
	}
	
	public String addCategory(){
		
//			categoryService.addCategory(category);
			System.out.println("Category added successfully.");
			addActionMessage("Category added successfully.");
		return SUCCESS;
	}
}
