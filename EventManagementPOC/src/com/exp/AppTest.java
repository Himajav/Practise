package com.exp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppTest 
{
    public static void main( String[] args )
    {
    	
    	
    	ApplicationContext context = 
    	  new ClassPathXmlApplicationContext(new String[] {"Spring-Customer.xml"});
/*
    	CustomerService cust = (CustomerService)context.getBean("customerService");
    	System.out.println(cust);
    */
    	
    	
    	BusinessService cust1 = (BusinessService)context.getBean("businessService");
    	cust1.getInfo();
    	System.out.println(cust1);
    	
    }
}