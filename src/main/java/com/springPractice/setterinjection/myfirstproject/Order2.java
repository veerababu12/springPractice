package com.springPractice.setterinjection.myfirstproject;

public class Order2 
{
	
	private String productId;
	private String productName;
	private String orderDate;
	private Customer2 customer;
	
	public Order2(String productId,String productName,String orderDate,Customer2 customer)
	{
		this.productId = productId;
		this.productName = productName;
		this.orderDate = orderDate;
		this.customer = customer;
	}
	
	//getter
	public String toString()
	{
		return "\npid="+productId+"\npname="+productName+"\norderDate="+orderDate;
	}


}
