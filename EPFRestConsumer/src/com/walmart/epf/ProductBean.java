package com.walmart.epf;

import java.io.Serializable;

public class ProductBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int productid;
	private String productName;
	private String productDesc;
	
	
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	  
	
	

}
