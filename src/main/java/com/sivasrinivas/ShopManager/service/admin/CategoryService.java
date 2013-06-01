package com.sivasrinivas.ShopManager.service.admin;
import com.sivasrinivas.ShopManager.model.CategoryModel;
import java.util.Collection;
import java.util.List;

public interface CategoryService {
	public void addCategory(CategoryModel category);
	public void updateCategory(CategoryModel category);
	public void deleteCategory(CategoryModel category);
	public Collection<CategoryModel> getCategoryList();
	public List<String> getCategoryNames();
	
}
