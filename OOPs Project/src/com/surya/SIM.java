package com.surya;

public interface SIM {
       String call(long MobileNumber);
       String sms(long MobileNumber,String Message);
}
