package com.customer.springboot.entity;
import javax.persistence.*;
@Entity
public class Customer {
	@Id
	private int cId;
	private String cName;
	private double cSalary;
	public Customer() {
		super();
	}
	public Customer(int cId, String cName, double cSalary) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cSalary = cSalary;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public double getcSalary() {
		return cSalary;
	}
	public void setcSalary(double cSalary) {
		this.cSalary = cSalary;
	}
	@Override
	public String toString() {
		return "Cosumter [cId=" + cId + ", cName=" + cName + ", cSalary=" + cSalary + "]";
	}
}
