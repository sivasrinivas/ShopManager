package com.sivasrinivas.ShopManager.service.admin;

import java.util.Collection;

import com.sivasrinivas.ShopManager.model.ProductModel;

public interface ProductService {

	public void insertProduct(ProductModel product);
	public void updateProduct(ProductModel product);
	public void insertOrUpdate(ProductModel product);
	public void deleteProduct(ProductModel product);
	public Collection<ProductModel> getProcutList();
	
}
