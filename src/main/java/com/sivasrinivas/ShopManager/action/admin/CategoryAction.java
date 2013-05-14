/**
 * 
 */
package com.sivasrinivas.ShopManager.action.admin;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Siva
 *
 */
public class CategoryAction extends ActionSupport{

	/**
	 * Generated serial version UID
	 */
	private static final long serialVersionUID = -7015399379262262506L;

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
		return "addCategorySetup";
	}
}
