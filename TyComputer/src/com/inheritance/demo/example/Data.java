package com.inheritance.demo.example;

public class Data {
	String name;
	String city;
	String state;
	String country;
	String mobile;
	void getData(String name, String city, String state, String country, String mobile) {
	
		this.name = name;
		this.city = city;
		this.state = state;
		this.country = country;
		this.mobile = mobile;
	}
	public String toString() {
		return "Data [name=" + name + ", city=" + city + ", state=" + state + ", country=" + country + ", mobile="
				+ mobile + "]";
	}


}
