package com.sivasrinivas.ShopManager.model;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="product")
public class ProductModel {
	//attributes of product model object
	@Id
	private BigInteger id;
	private String name;
	private String color;
	private String brandName;
	private BigDecimal price;
	private boolean isNew;
	private boolean isCountable;
	private boolean isDeprecated;
	private String dimensions;
	private String image;
	private DateTime created;
	private String createdBy;
	private DateTime updated;
	private String updatedBy;
	
	/**
	 * getters and setters
	 */
	/**
	 * @return the sKU
	 */
	public BigInteger getId() {
		return id;
	}
	/**
	 * @param sKU the sKU to set
	 */
	public void setId(BigInteger id) {
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
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	/**
	 * @return the isDeprecated
	 */
	public boolean isDeprecated() {
		return isDeprecated;
	}
	/**
	 * @param isDeprecated the isDeprecated to set
	 */
	public void setDeprecated(boolean isDeprecated) {
		this.isDeprecated = isDeprecated;
	}
	/**
	 * @return the created
	 */
	public DateTime getCreated() {
		return created;
	}
	/**
	 * @param created the created to set
	 */
	public void setCreated(DateTime created) {
		this.created = created;
	}
	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}
	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	/**
	 * @return the updated
	 */
	public DateTime getUpdated() {
		return updated;
	}
	/**
	 * @param updated the updated to set
	 */
	public void setUpdated(DateTime updated) {
		this.updated = updated;
	}
	/**
	 * @return the updatedBy
	 */
	public String getUpdatedBy() {
		return updatedBy;
	}
	/**
	 * @param updatedBy the updatedBy to set
	 */
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the brandName
	 */
	public String getBrandName() {
		return brandName;
	}
	/**
	 * @param brandName the brandName to set
	 */
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	/**
	 * @return the isNew
	 */
	public boolean isNew() {
		return isNew;
	}
	/**
	 * @param isNew the isNew to set
	 */
	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}
	/**
	 * @return the isCountable
	 */
	public boolean isCountable() {
		return isCountable;
	}
	/**
	 * @param isCountable the isCountable to set
	 */
	public void setCountable(boolean isCountable) {
		this.isCountable = isCountable;
	}
	/**
	 * @return the dimensions
	 */
	public String getDimensions() {
		return dimensions;
	}
	/**
	 * @param dimensions the dimensions to set
	 */
	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}
	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}
	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}
}
