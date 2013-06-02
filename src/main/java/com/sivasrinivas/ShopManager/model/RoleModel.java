package com.sivasrinivas.ShopManager.model;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="role")
public class RoleModel {
	@Id
	private BigInteger id;
	private String name;
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
	 * @return the role
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param role the role to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
