package com.flower.springboot.entity;
import javax.persistence.*;
@Entity
public class Flower {
	@Id
	private int fCode;
	private String fName;
	private String fColour;
	private double fCost;
	public Flower() {
		super();
	}
	public Flower(int fCode, String fName, String fColour, double fCost) {
		super();
		this.fCode = fCode;
		this.fName = fName;
		this.fColour = fColour;
		this.fCost = fCost;
	}
	public int getfCode() {
		return fCode;
	}
	public void setfCode(int fCode) {
		this.fCode = fCode;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getfColour() {
		return fColour;
	}
	public void setfColour(String fColour) {
		this.fColour = fColour;
	}
	public double getfCost() {
		return fCost;
	}
	public void setfCost(double fCost) {
		this.fCost = fCost;
	}
	@Override
	public String toString() {
		return "Flower [fCode=" + fCode + ", fName=" + fName + ", fColour=" + fColour + ", fCost=" + fCost + "]";
	}
}