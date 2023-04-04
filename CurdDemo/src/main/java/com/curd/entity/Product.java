package com.curd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblProduct")
public class Product {
	@Column(name="pId")
	@Id
	private int id;
	@Column(name="pName")
	
	private String name;
	@Column(name="pDesc")
	private  String Description;
	@Column(name="pPrice")
	private  float price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", Description=" + Description + ", price=" + price + "]";
	}
	
}
