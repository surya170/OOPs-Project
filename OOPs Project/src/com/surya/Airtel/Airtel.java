package com.surya.Airtel;

import com.surya.SIM;

public class Airtel implements SIM{


	public String call(long MobileNumber) {
		// TODO Auto-generated method stub
		return "Airtel:The number you are calling  busy";
		
	}

	
	public String sms(long MobileNumber, String Message) {
		// TODO Auto-generated method stub
		return "Airtel:The Message sent succesfully";
		
	}



}
