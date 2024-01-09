package com.springPractice.setterinjection.myfirstproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 
 use ctrl+space then suggestion names,import statement also added.
 
 */
public class App 
{
    public static void main( String[] args )
    {
    	//creating spring container.it acts like a bean factory.
    	
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springPractice/setterinjection/myfirstproject/Configurationmetadata.xml"); // if cmd out of src then  no need to specify
		
		//get object
		
		Customer customer=(Customer)context.getBean("cus"); // getbean returns as obj form and to convert to custoner type we use explict type conversion here
		
		System.out.println("name="+customer.getName());
    }
}
