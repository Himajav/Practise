package com.dao;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class CassandraConnection {
	private static Session session = null;
	 protected CassandraConnection() {
	   
	   }
	
	public static Session getDBConnectionInstance() {
		if(session==null){
		   // Exists only to defeat instantiation.	
				 Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();		   
			      //Creating Session object
				 session = cluster.connect("testdb");//Keyspace
				 
		}
	      return session;
	   }
}
