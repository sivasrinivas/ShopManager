/**
 * 
 */
package com.sivasrinivas.ShopManager.service.admin;

import java.util.Collection;
import java.util.List;

import com.sivasrinivas.ShopManager.model.RoleModel;

/**
 * @author Siva
 *
 */
public interface RoleService {
	void addRole(RoleModel role);
	void deleteRole(RoleModel role);
	Collection<String> getRoleNamesList();
	void deleteRoleByName(String roleName);
	List<RoleModel> getRoleList();
}
