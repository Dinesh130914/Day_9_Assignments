package com.bl.empwage;

public class Emp_UC2 {
static int is_present,random,dailywage,wage_per_hour,working_hour;
	
	public static void main(String[] args)
	{
		 wage_per_hour = 20;
		 working_hour = 8;
		 dailywage = 0;
		 is_present =1;
		 random = (int) (Math.floor(Math.random()*10)%2);
		 Calculatewage();
	}
	
	public static void Calculatewage() 
	{
		if(random==1) 
		{
			dailywage = working_hour*wage_per_hour;
			System.out.println("Emp Wage :"+dailywage);
		}else 
		{
			System.out.println("Emp wage :"+dailywage);
		}
	}
}
