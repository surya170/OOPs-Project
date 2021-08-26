package com.surya.Vodafone;

import com.surya.SIM;

public class Vodafone implements SIM {

	@Override
	public String call(long MobileNumber) {
		return "Vodafone:The Number you are calling is not reachable";
	}

	@Override
	public String sms(long MobileNumber, String Message) {
		return "Vodafone:The Message sent successfully";
	}
	

}
