package com.springPractice.setterinjection.myfirstproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App3
{
    public static void main( String[] args )
    {
    	
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springPractice/setterinjection/myfirstproject/cmd2.xml"); // if cmd out of present pkg then  no need to specify
		
		
		Customer3 customer=(Customer3)context.getBean("customer3"); // getbean returns as obj form and to convert to custoner type we use explict type conversion here
		
		System.out.println("name="+customer.getName()+"\ncontact="+customer.getContact()+"\naddress="+customer.getAddress());
		

		Order3 order=(Order3)context.getBean("order"); 
		
		System.out.println("productId="+order.getProductId()+"\nproductName="+order.getProductName()+"\norderDate="+order.getOrderDate()+"\nCustomer name="+order.getCustomer().getName());
    }
}
