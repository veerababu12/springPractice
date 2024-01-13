package com.springPractice.setterinjection.myfirstproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App2
{
    public static void main( String[] args )
    {
    	
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springPractice/setterinjection/myfirstproject/Configurationmetadata.xml"); // if cmd out of present pkg then  no need to specify
		
		
		Customer2 customer=(Customer2)context.getBean("cus2"); // getbean returns as obj form and to convert to custoner type we use explict type conversion here
		
		System.out.println("\ncus2="+customer.toString());
		

		Order2 order=(Order2)context.getBean("order2"); //use customer if autowiring by constructor
		
		System.out.println("\norder2"+order.toString());  
		}
}
