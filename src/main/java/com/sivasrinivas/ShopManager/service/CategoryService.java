package com.sivasrinivas.ShopManager.service;
import com.sivasrinivas.ShopManager.model.CategoryModel;
import java.util.Collection;

public interface CategoryService {
	public void addCategory(CategoryModel category);
	public void updateCategory(CategoryModel category);
	public void deleteCategory(CategoryModel category);
	public Collection<CategoryModel> getCategoryList();
	
}
