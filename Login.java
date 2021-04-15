package com.vignesh;
public class Login extends WelcomePage{

	public static void loginpage()
	{
	
		System.out.println("Enter the mobile number");
		String mobileNo=sc.next();
		System.out.println("Enter the password");
		String password=sc.next();
		while(mobileNo.length()!=10)
		{
			System.out.println("mobile number is Invalid");
			System.out.println("Enter the valid mobile number");
			mobileNo=sc.next();
		}
		
		while(password.length()<8)
		{
			
			System.out.println("password is invalid");
			System.out.println("Enter the valid password");
			password=sc.next();
		}
 		
	}
}
