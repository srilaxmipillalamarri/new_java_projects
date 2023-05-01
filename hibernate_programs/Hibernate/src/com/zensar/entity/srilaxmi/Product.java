package com.zensar.entity.srilaxmi;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private int pId;
	private String pName;
	private int pCost;
	private String pLoc;
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pCost=" + pCost + ", pLoc=" + pLoc + "]";
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpCost() {
		return pCost;
	}
	public void setpCost(int pCost) {
		this.pCost = pCost;
	}
	public String getpLoc() {
		return pLoc;
	}
	public void setpLoc(String pLoc) {
		this.pLoc = pLoc;
	}
	public Product(int pId, String pName, int pCost, String pLoc) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pCost = pCost;
		this.pLoc = pLoc;
	}
	public Product() {
		super();
	}

}
