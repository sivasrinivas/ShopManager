package com.sivasrinivas.ShopManager.action.admin;

import java.util.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.sivasrinivas.ShopManager.model.RoleModel;
import com.sivasrinivas.ShopManager.service.admin.RoleService;

public class RoleAction {
	
	private RoleModel role;
	private Collection<RoleModel> roleList;
	ApplicationContext ctx = new GenericXmlApplicationContext("spring.xml");
	RoleService roleService = (RoleService)ctx.getBean("roleService");
	
	public String addRole(){
		String result="addRole";
		
		return result;
	}

	public String saveRole(){
		String result="addRole";
		roleService.addRole(role);
		
		return result;
	}
	/**
	 * @return the role
	 */
	public RoleModel getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(RoleModel role) {
		this.role = role;
	}

	/**
	 * @return the roleList
	 */
	public Collection<RoleModel> getRoleList() {
		return roleList;
	}

	/**
	 * @param roleList the roleList to set
	 */
	public void setRoleList(Collection<RoleModel> roleList) {
		this.roleList = roleList;
	}
}
