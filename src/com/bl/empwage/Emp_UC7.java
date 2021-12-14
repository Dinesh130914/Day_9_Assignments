package com.bl.empwage;

public class Emp_UC7 {
	static int is_present = 1;
	static int is_absent = 2;
	static int random,dailywage,working_hour,totalwage,total_work_hour,total_working_days;
	static int wage_per_hour = 20;
	static int max_work_hour = 100;
	static int  working_days = 20;
	
	public static void Calcuclatewage() 
	{
		 dailywage = 0;
		 totalwage = 0;
		 total_work_hour = 0;
		 total_working_days = 0;
		 
		 
		while(total_work_hour<=max_work_hour&&total_working_days<working_days) 
		{
			total_working_days++;
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
			total_work_hour+=working_hour;
			System.out.println("Day"+" "+total_working_days+" "+"Working Hours"+" "+working_hour+" "+"Wage "+" "+dailywage);;
		}
		int total_emp_wage = total_work_hour*wage_per_hour;
		System.out.println("Total Emp Wage : "+total_emp_wage);
	}
		public static void main(String[] args) 
		{
			Calcuclatewage();
		}

}
