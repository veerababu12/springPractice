package com.springPractice.setterinjection.myfirstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//for autowiring using annotations

public class Order3 {
	
	private String productId;
	private String productName;
	private String orderDate;
	
	@Autowired
	@Qualifier("customer3")
	private Customer3 customer;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public Customer3 getCustomer() {
		return customer;
	}

	public void setCustomer(Customer3 customer) {
		this.customer = customer;
	}
	
	

}
