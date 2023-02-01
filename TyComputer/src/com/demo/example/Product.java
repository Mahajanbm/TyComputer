package com.demo.example;

public class Product {
private int pId;
private String pName;
private String pDes;
private float pPrice;

public Product() {
	super();
	// TODO Auto-generated constructor stub
}

public Product(int pId, String pName, String pDes, float pPrice) {
	super();
	this.pId = pId;
	this.pName = pName;
	this.pDes = pDes;
	this.pPrice = pPrice;
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
public String getpDes() {
	return pDes;
}
public void setpDes(String pDes) {
	this.pDes = pDes;
}
public float getpPrice() {
	return pPrice;
}
public void setpPrice(float pPrice) {
	this.pPrice = pPrice;
}




}
