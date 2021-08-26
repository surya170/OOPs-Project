package com.surya.BSNL;

import com.surya.SIM;

public class BSNL implements SIM {

	@Override
	public String call(long MobileNumber) {
        return "BSNL:All Lines are busy ,please try after some time";	

	}

	@Override
	public String sms(long MobileNumber, String Message) {
		return "BSNL:The message sent successfully";
	}
   
}
