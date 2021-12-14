package com.bl.empwage;

public class Emp_UC5 {
	static int is_present,random,dailywage,wage_per_hour,working_hour,is_absent,working_days,totalwage;

	public static void main(String[] args)
	{
		wage_per_hour = 20;
		 dailywage = 0;
		 is_present =1;
		 is_absent = 2;
		 working_days = 20;
		 totalwage = 0;
		 monthlywage();
	}
	
	public static void monthlywage() 
	{
		for (int i = 0; i < working_days; i++)
		{
			random = (int) (Math.floor(Math.random()*10)%3);
			switch(random) 
			{
			case 1:
				working_hour = 8;
				dailywage = working_hour*wage_per_hour;
				break;
			case 2:
				working_hour = 4;
				dailywage = working_hour*wage_per_hour;
				break;
			default :
				working_hour = 0;
				dailywage = working_hour*wage_per_hour;
			}
			totalwage+=dailywage;
		}
		System.out.println("Total Emp Wage :"+totalwage);
	}

}
