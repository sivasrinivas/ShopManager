package com.sivasrinivas.ShopManager.action.admin;

import java.util.Collection;

import com.sivasrinivas.ShopManager.model.AdminModel;

public class AdminAction {
	private AdminModel admin;
	private Collection<String> roleList;
	
	public String addAdmin(){
		String result = "addAdmin" ;
		return result;
	}

	/**
	 * @return the admin
	 */
	public AdminModel getAdmin() {
		return admin;
	}

	/**
	 * @param admin the admin to set
	 */
	public void setAdmin(AdminModel admin) {
		this.admin = admin;
	}

	/**
	 * @return the roleList
	 */
	public Collection<String> getRoleList() {
		return roleList;
	}

	/**
	 * @param roleList the roleList to set
	 */
	public void setRoleList(Collection<String> roleList) {
		this.roleList = roleList;
	}
}
