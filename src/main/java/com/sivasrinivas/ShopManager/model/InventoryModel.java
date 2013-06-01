package com.sivasrinivas.ShopManager.model;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="inventory")
public class InventoryModel {
	@Id
	private BigInteger SKU;
	private BigInteger quantity;
	/**
	 * @return the sKU
	 */
	public BigInteger getSKU() {
		return SKU;
	}
	/**
	 * @param sKU the sKU to set
	 */
	public void setSKU(BigInteger sKU) {
		SKU = sKU;
	}
	/**
	 * @return the quantity
	 */
	public BigInteger getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(BigInteger quantity) {
		this.quantity = quantity;
	}
}
