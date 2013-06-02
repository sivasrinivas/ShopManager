package com.sivasrinivas.ShopManager.action.admin;

import java.util.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.sivasrinivas.ShopManager.model.RoleModel;
import com.sivasrinivas.ShopManager.service.admin.RoleService;

public class RoleAction {
	ApplicationContext ctx = new GenericXmlApplicationContext("spring.xml");
	RoleService roleService = (RoleService)ctx.getBean("roleService");
	
	private RoleModel role;
	private String roleName;
	private Collection<String> roleList;
	
	public String addRole(){
		String result="addRole";
		role = null;
		roleList = roleService.getRoleNamesList();
		return result;
	}

	public String saveRole(){
		String result="addRole";
		roleService.addRole(role);
		return addRole();
	}
	
	public String removeRole(){
		roleService.deleteRoleByName(roleName);
		return addRole();
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
	public Collection<String> getRoleList() {
		return roleList;
	}

	/**
	 * @param roleList the roleList to set
	 */
	public void setRoleList(Collection<String> roleList) {
		this.roleList = roleList;
	}

	/**
	 * @return the roleName
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * @param roleName the roleName to set
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}
