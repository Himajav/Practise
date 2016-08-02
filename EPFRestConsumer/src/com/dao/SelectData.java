package com.dao;


import java.util.Iterator;

import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import com.walmart.epf.ProductBean;

public class SelectData {
	public void getEmpData(ProductBean bean ){
		System.out.println("getEmpData ");
		     
		String query = "INSERT INTO testdb.product(product_id,product_name, product_desc) VALUES ("+bean.getProductid()+",'"+bean.getProductName()+"','Product1Desc');";
		System.out.println(query);	  
		
		//Select Query
		//String query = "select * from product;";
			
	    //Creating Cluster object
	      Session session = CassandraConnection.getDBConnectionInstance();
	 
	      //Executing the query
	      ResultSet  rs = session.execute(query);
	      Iterator<Row> it = rs.iterator();   
	      System.out.println("Table created");
	      while (it.hasNext()) {
	    	      Row r = it.next();
	    	      System.out.println("Table created"+r);
	      System.out.println("Table created"+r.getInt("emp_id"));
	      }
	   }

	
}
