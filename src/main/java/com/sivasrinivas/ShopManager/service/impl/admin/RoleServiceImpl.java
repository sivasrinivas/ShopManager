package com.sivasrinivas.ShopManager.service.impl.admin;

import java.util.Collection;
import java.util.List;

import com.sivasrinivas.ShopManager.dao.MasterDAO;
import com.sivasrinivas.ShopManager.dao.RoleDAO;
import com.sivasrinivas.ShopManager.model.RoleModel;
import com.sivasrinivas.ShopManager.service.admin.RoleService;

public class RoleServiceImpl implements RoleService{
	private RoleDAO roleDAO;
	private MasterDAO masterDAO;
	
	@Override
	public void addRole(RoleModel role) {
		roleDAO.insert(role);
	}

	@Override
	public void deleteRole(RoleModel role) {
		role = roleDAO.findById(role);
		role.setDeprecated(true);
		masterDAO.save(role);
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
	@Override
	public List<RoleModel> getRoleList(){
		List<RoleModel> roleList = roleDAO.getList();
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

	/**
	 * @return the commonDAO
	 */
	public MasterDAO getCommonDAO() {
		return masterDAO;
	}

	/**
	 * @param commonDAO the commonDAO to set
	 */
	public void setMasterDAO(MasterDAO masterDAO) {
		this.masterDAO = masterDAO;
	}

	

}
