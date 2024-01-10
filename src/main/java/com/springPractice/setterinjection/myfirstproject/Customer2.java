package com.springPractice.setterinjection.myfirstproject;

public class Customer2 
{
	
	private String name;
	private String contact;
	private String address;
	
	//setter using constructor
	public Customer2(String name,String contact,String address)
	{
		this.name=name;
		this.address=address;
		this.contact=contact;
	}
	
	//getter
	public String toString()
	{
		return "\ncustomer name="+name+"\ncontact="+contact+"\naddress="+address;
	}


}
