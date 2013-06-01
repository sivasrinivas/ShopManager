package com.sivasrinivas.ShopManager.model;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="product")
public class ProductModel {
	//attributes of product model object
	@Id
	private BigInteger SKU;
	private String name;
	private BigDecimal price;
	private BigDecimal discPrice;
	private boolean isDisc;
	
	/**
	 * getters and setters
	 */
	/**
	 * @return the sKU
	 */
	public BigInteger getSKU() {
		return SKU;
	}
	/**
	 * @param sKU the sKU to set
	 */
	public void setSKU(BigInteger SKU) {
		this.SKU = SKU;
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
	 * @return the discPrice
	 */
	public BigDecimal getDiscPrice() {
		return discPrice;
	}
	/**
	 * @param discPrice the discPrice to set
	 */
	public void setDiscPrice(BigDecimal discPrice) {
		this.discPrice = discPrice;
	}
	/**
	 * @return the isDisc
	 */
	public boolean isDisc() {
		return isDisc;
	}
	/**
	 * @param isDisc the isDisc to set
	 */
	public void setDisc(boolean isDisc) {
		this.isDisc = isDisc;
	}
}
