package com.sivasrinivas.ShopManager.service;

import java.util.Collection;
import java.util.List;

public interface MasterService {
	<T> List<T> findAll(Class<T> entityClass);
	<T> T findById(Object id, Class<T> entityClass);
}


