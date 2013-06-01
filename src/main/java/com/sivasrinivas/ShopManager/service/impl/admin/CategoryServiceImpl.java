package com.sivasrinivas.ShopManager.service.impl.admin;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.sivasrinivas.ShopManager.dao.CategoryDAO;
import com.sivasrinivas.ShopManager.model.CategoryModel;
import com.sivasrinivas.ShopManager.service.admin.CategoryService;

@Repository
public class CategoryServiceImpl implements CategoryService{
	static Logger logger = Logger.getLogger(CategoryServiceImpl.class);
	
	private CategoryDAO categoryDAO;
	//private MongoOperations mongoOperations;
	
	/**
	 * gets all existing categories list
	 */
	@Override
	public Collection<CategoryModel> getCategoryList() {
		return categoryDAO.getAllDocuments();
	}

	/*
	 * get all category names
	 */
	public List<String> getCategoryNames(){
		return categoryDAO.getCategoryNames();
	}

	@Override
	public void addCategory(CategoryModel category) {
		categoryDAO.insert(category);
	}

	@Override
	public void updateCategory(CategoryModel category) {
		categoryDAO.saveOrUpdate(category);
	}

	@Override
	public void deleteCategory(CategoryModel category) {
		categoryDAO.remove(category);
	}

	//Getters and Setters
	/**
	 * @return the categoryDAO
	 */
	public CategoryDAO getCategoryDAO() {
		return categoryDAO;
	}

	/**
	 * @param categoryDAO the categoryDAO to set
	 */
	public void setCategoryDAO(CategoryDAO categoryDAO) {
		this.categoryDAO = categoryDAO;
	}

}
