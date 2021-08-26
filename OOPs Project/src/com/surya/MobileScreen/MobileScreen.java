package com.surya.MobileScreen;

import java.util.Scanner;

import com.surya.Mobile.Mobile;

public class MobileScreen {

	public static void main(String[] args) throws Exception  {
      
	Scanner scn = new Scanner(System.in);
		
	 Mobile iphone = new Mobile();
	 String simName = "";
	 while(true) {
	 try {
     System.out.print("Enter SIM:");
     simName = scn.next(); 
     iphone.insertSIM(simName);
     
     System.out.println("SIM is activated successfully");
     
     while(true)
     {
     System.out.println("\nChoose one option");
     System.out.println("1.call");
     System.out.println("2.sms");
     
     
     System.out.print("\nEnter your option");
     int option = scn.nextInt();
     
     String resp=" ";
     
	switch(option)
     {
     case 1:  // call operation
    	  System.out.println("/nEnter mobile number");
    	  iphone.call(scn.nextLong());
    	  System.out.println(resp);
    	  break;
    	 
     case 2: //sms operation
    	 System.out.print("Enter Mobile Number");
    	 long mobile = scn.nextLong(); scn.nextLong();
    	 
    	 System.out.print("Enter Message");
    	 String Message = scn.nextLine();
    	 
    	 resp = iphone.sms(mobile, Message);
    	 System.out.println(resp);
    	 break;
    
    	 
    default:
           System.out.println("Invalid Option");
    
     } //switch close
     
     }//while close
	 }catch(ClassNotFoundException e) {
		 System.out.println(simName+".class is not found ");
	 }catch(InstantiationException e) {     
		 System.out.println(simName+"class does not have no param constructor");
	 }catch(IllegalAccessException e) {
		 System.out.println(simName+"class param constructor is not public ");
	 }catch(IllegalArgumentException e) {
		 System.out.println(e.getMessage());
	 }
	 
	 }//while close
	
	}//method

} // class
