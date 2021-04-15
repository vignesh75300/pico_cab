package com.vignesh;
import java.time.LocalDate;
import java.time.LocalTime;
public class Bill
{
public void billing(String cabname,double tprice,LocalDate Jdate,LocalTime Ptime)
{
	System.out.println("Booking Details");
	System.out.println("Cab choice :"+cabname+"");
	System.out.println("Journey date :"+Jdate+"");
	System.out.println("Pickup Time :"+Ptime+"");
	System.out.println("Your Total price is :"+tprice+"");
	System.out.println("Successfully Booking");
	System.out.println("Thankyou");
}

}
