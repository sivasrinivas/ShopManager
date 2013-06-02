package com.sivasrinivas.ShopManager.service.impl.admin;

import java.util.Collection;

import com.sivasrinivas.ShopManager.dao.RoleDAO;
import com.sivasrinivas.ShopManager.model.RoleModel;
import com.sivasrinivas.ShopManager.service.admin.RoleService;

public class RoleServiceImpl implements RoleService{
	private RoleDAO roleDAO;
	
	@Override
	public void addRole(RoleModel role) {
		roleDAO.insert(role);
	}

	@Override
	public void deleteRole(RoleModel role) {
		roleDAO.remove(role);
	}
	
	@Override
	public void deleteRoleByName(String roleName){
		roleDAO.removeByName(roleName);
	}
	
	@Override
	public Collection<String> getRoleNamesList() {
		Collection<String> roleList = roleDAO.getNames();
		return roleList;
	}

	/**
	 * @return the roleDAO
	 */
	public RoleDAO getRoleDAO() {
		return roleDAO;
	}

	/**
	 * @param roleDAO the roleDAO to set
	 */
	public void setRoleDAO(RoleDAO roleDAO) {
		this.roleDAO = roleDAO;
	}

	

}
