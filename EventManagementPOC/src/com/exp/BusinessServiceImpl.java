package com.exp;

public class BusinessServiceImpl 
{
	@Override
	public String toString() {
		return "Hello , This is CustomerDAO";
	}	
	
	
	CustomerDAO customerDAO;

	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

public void getInfo(){
		
		System.out.println("getInfo ====BusinessServiceImpl");
		customerDAO.getInfo();
	}
	
	
}