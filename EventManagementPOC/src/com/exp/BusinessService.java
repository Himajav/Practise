package com.exp;


public class BusinessService 
{
	BusinessServiceImpl businessServiceImpl;
	
	
	@Override
	public String toString() {
		return "CustomerService [businessServiceImpl=" + businessServiceImpl + "]";
	}


	public void setBusinessServiceImpl(BusinessServiceImpl businessServiceImpl) {			
		this.businessServiceImpl = businessServiceImpl;
	}
	
	public void getInfo(){
		
		System.out.println("getInfo ====BusinessService");
		businessServiceImpl.getInfo();
	}
}