package com.surya.Mobile;

import com.surya.SIM;

public class Mobile {
 
	private SIM sim;
	public void insertSIM(String simName) throws ClassNotFoundException,Exception,InstantiationException,IllegalArgumentException
	{
		//Loading class
		Class cls = Class.forName(simName);
		
		//Instantitate the class 
		Object obj = cls.newInstance();
		
		//store this object in mobile
		if(obj instanceof SIM)
		  sim = (SIM)obj;
		else
			throw new Exception(simName+"is not SIM type");
		
	} //method
	
	public String call(long mobileNumber)
	{
		 return sim.call(mobileNumber);
	}//method
	
	public String sms(long mobilenumber,String message)
	{
		return sim.sms(mobilenumber, message);
	}//method
	
}//class
