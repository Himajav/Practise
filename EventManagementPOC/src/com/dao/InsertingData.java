package com.dao;

import java.util.Iterator;

import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;

public class InsertingData {
	public static void main(String args[]){

		     
	      //String query = "INSERT INTO testdb.emp1(emp_id,emp_name, emp_city, emp_sal,emp_phone) VALUES (1002,'Tanush','Bentonville',1000,7577060514);";
	      
	      //Select Query
	    String query = "select * from emp1;";
			
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
