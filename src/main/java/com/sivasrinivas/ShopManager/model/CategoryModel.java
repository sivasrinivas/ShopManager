package com.sivasrinivas.ShopManager.model;

import java.util.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.BasicDBObject;

@Document(collection = "category")
public class CategoryModel {

	/**
	 * Attributes of the Category Model object
	 */
	@Id
	private String id;
	private String name;
	private String description;
	private Collection<String> subCategories;
	
	public BasicDBObject toBasicDBObject(){
		BasicDBObject document = new BasicDBObject();
		document.put("id", getId());
		document.put("name", getName());
		document.put("description", getDescription());
		document.put("subCategories", getSubCategories());
		return document;
	}
	
	/**
	 * Getters and Setters
	 */
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the subCategories
	 */
	public Collection<String> getSubCategories() {
		return subCategories;
	}
	/**
	 * @param subCategories the subCategories to set
	 */
	public void setSubCategories(Collection<String> subCategories) {
		this.subCategories = subCategories;
	}
	
}
