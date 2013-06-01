package com.sivasrinivas.ShopManager.model;

import java.math.BigInteger;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="invoice")
public class InvoiceModel {
	@Id
	private BigInteger id;
	private Date genDate;
	private BigInteger userId;
	/**
	 * @return the id
	 */
	public BigInteger getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(BigInteger id) {
		this.id = id;
	}
	/**
	 * @return the genDate
	 */
	public Date getGenDate() {
		return genDate;
	}
	/**
	 * @param genDate the genDate to set
	 */
	public void setGenDate(Date genDate) {
		this.genDate = genDate;
	}
	/**
	 * @return the userId
	 */
	public BigInteger getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}
}
