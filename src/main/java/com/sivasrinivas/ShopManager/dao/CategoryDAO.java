package com.sivasrinivas.ShopManager.dao;

import java.util.Collection;
import java.util.List;

import com.sivasrinivas.ShopManager.model.CategoryModel;

public interface CategoryDAO {
	public void insert(CategoryModel category);
	public void saveOrUpdate(CategoryModel category);
	public void remove(CategoryModel category);
	public Collection<CategoryModel> getAllDocuments();
	public List<String> getCategoryNames();
}
