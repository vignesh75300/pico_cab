package com.vignesh;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.*;
public class WelcomePage 
{
  static Scanner sc=new Scanner(System.in);
  public static void main(String args[])
  {
	  
	  System.out.println("WELCOME TO OLA CAB");
	  System.out.println("1.Login");
	  System.out.println("2.Exit");
	  
	  int Login_new=sc.nextInt();
	  if(Login_new==1)
	  {
		  Login login=new Login();
		  login.loginpage();
	  }
	 
	  else if(Login_new==2)
	  {
		  System.out.println("Thank you for Visiting");
		  System.exit(0);
	  }
	  String cab_name=" ";
	  double final_price=0.0;
	  String booking_choice=" ";
	  Bill bill=new Bill();
	  System.out.println("Enter your kilometer");
	  int kilometer=sc.nextInt();
	  LocalDate currentDate=LocalDate.now();
	  System.out.println("Enter your Journey date");
	  String Journey_date=sc.next();
	  LocalDate date=LocalDate.parse(Journey_date);
	  System.out.println("Enter your pickupTime");
	  String pickup_Time=sc.next();
	  LocalTime time=LocalTime.parse(pickup_Time);
	  int hour=time.getHour();
	  System.out.println("Enter your date of birth");
	  String DOB=sc.next();
      LocalDate dateOfBirth =LocalDate.parse(DOB);
      int age=Period.between(dateOfBirth, currentDate).getYears();
	  System.out.println("Enter your Cab choise");
	  System.out.println("1.micro");
	  System.out.println("2.mini");
	  System.out.println("3.prime");
	  int choise1=sc.nextInt();
	  switch(choise1) 
	  {
	  case 1:micro m1=new micro();
            final_price=m1.priceamount(kilometer, hour, age);
            cab_name="micro";
            System.out.println("Do you conform your Booking YES/NO:");
            booking_choice=sc.next();
            if(booking_choice.equals("yes") || booking_choice.equals("YES"))
            {
            	bill.billing(cab_name,final_price,date,time);
            	
            }
            else
            {
            	System.exit(0);
            }
            break;
            
	  case 2:mini m2=new mini();
	         final_price=m2.priceamount(kilometer, hour, age);
             cab_name="mini";
             System.out.println("Do you conform your Booking YES/NO:");
             booking_choice=sc.next();
            if(booking_choice.equals("yes") || booking_choice.equals("YES"))
            {
          	bill.billing(cab_name,final_price,date,time);
     
            }
           else
            {
        	System.exit(0);
            }
             break;
	  case 3:prime p=new prime();
	         final_price=p.priceamount(kilometer, hour, age);
             cab_name="prime";
             System.out.println("Do you conform your Booking YES/NO:");
             booking_choice=sc.next();
             if(booking_choice.equals("yes") || booking_choice.equals("YES"))
             {
          	   bill.billing(cab_name,final_price,date,time);
      	
              }
             else
                 {
      	        System.exit(0);
                }
            break;
	  default:System.out.println("Invalid cab");
            
	  }
	  sc.close();
	  
		  
	  
  }
	
	
}
