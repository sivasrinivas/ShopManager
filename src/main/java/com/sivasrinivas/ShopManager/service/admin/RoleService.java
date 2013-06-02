/**
 * 
 */
package com.sivasrinivas.ShopManager.service.admin;

import java.util.Collection;

import com.sivasrinivas.ShopManager.model.RoleModel;

/**
 * @author Siva
 *
 */
public interface RoleService {
	public void addRole(RoleModel role);
	public void deleteRole(RoleModel role);
	public Collection<String> getRoleNamesList();
	public void deleteRoleByName(String roleName);
}
