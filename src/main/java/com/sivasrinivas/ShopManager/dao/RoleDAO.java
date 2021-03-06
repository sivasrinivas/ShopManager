package com.sivasrinivas.ShopManager.dao;

import java.util.Collection;
import java.util.List;

import com.sivasrinivas.ShopManager.model.RoleModel;

public interface RoleDAO {
	public void insert(RoleModel role);
	public void remove(RoleModel role);
	public Collection<String> getNames();
	public void removeByName(String roleName);
	List<RoleModel> getList();
	public RoleModel findById(RoleModel role);
}
