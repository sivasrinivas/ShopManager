/**
 * 
 */
package com.sivasrinivas.ShopManager.dao;

import java.util.List;

/**
 * @author Siva
 */
public interface MasterDAO {
	void deprecate(Object modelObjectToDeprecate);
	void deprecate(Object modelObjectToDeprecate, String collectionName);
	void remove(Object modelObjectToRemove);
	void remove(Object modelObjectToRemove, String collectionName);
	void save(Object modelObjectToSave);
	void save(Object modelObjectToSave, String collectionName);
	<T> List<? extends Object> findAll(Class<?> modelClass);
}
