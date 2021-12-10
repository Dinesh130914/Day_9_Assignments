package com.bl.empwage;

public class Emp_UC3 {
static int is_present,random,dailywage,wage_per_hour,working_hour,is_absent;
	
	public static void main(String[] args)
	{
		wage_per_hour = 20;
		 dailywage = 0;
		 is_present =1;
		 is_absent = 2;
		 random = (int) (Math.floor(Math.random()*10)%3);
		 Calculatewage();
	}
	public static void Calculatewage() 
	{
		if(is_present==random) 
		{
			working_hour = 8;
			dailywage = working_hour*wage_per_hour;
			System.out.println("Emp wage :"+dailywage);
		}
		else if(is_absent==random) 
		{
			working_hour = 4;
			dailywage = working_hour*wage_per_hour;
			System.out.println("Emp wage :"+dailywage);
		}
		else 
		{
			System.out.println("Emp Wage :"+dailywage);
		}
	}
}		
