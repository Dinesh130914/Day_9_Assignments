package com.bl.empwage;

public class Emp_UC4 {
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
		switch(random) 
		{
		case 1:
			working_hour = 8;
			dailywage = working_hour*wage_per_hour;
			System.out.println("Emp wage :"+dailywage);
			break;
		case 2:
			working_hour = 4;
			dailywage = working_hour*wage_per_hour;
			System.out.println("Emp wage :"+dailywage);
			break;
		default :
			working_hour = 0;
			dailywage = working_hour*wage_per_hour;
			System.out.println("Emp wage :"+dailywage);
		}
	}
}	
