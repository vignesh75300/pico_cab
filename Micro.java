package com.vignesh;

public class Micro {

	public double priceamount(int fare,int hour,int age) 
	{   
		if(hour<17 || hour>19)
		{
		int price=fare*10;
		double Gst= (price*7)/100.0;
		double Total_price=(price+Gst);
		System.out.println(" Total Price Amount is "+Total_price);
		if(age>60)
		{
			double senior_citizen=(Total_price)/2;
			return Total_price-senior_citizen;
			
		}
		return (Total_price);
		
		}
		else
		{
			double peak_Price=(10*5)/100.0;
			double price=(fare*10)+peak_Price;
			double Gst=(price*7)/100.0;
			double Total_price=(price+Gst);
			System.out.println(" Total Price Amount is "+Total_price);
			if(age>60)
			{
				double senior_citizen=(Total_price)/2;
				return Total_price-senior_citizen;
				
			}
			return (Total_price);
			
			}
		}
		
		
				
	}

