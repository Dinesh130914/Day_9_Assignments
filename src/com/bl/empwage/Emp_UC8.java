package com.bl.empwage;

public class Emp_UC8 {
	static int is_present = 1;
	static int is_absent = 2;
	static int random,dailywage,working_hour,totalwage,total_work_hour,total_working_days;
	
	public static int Calcuclatewage(String company,int wageperhour,int numofworkingdays,int maxhourpermoth ) 
	{
		 dailywage = 0;
		 totalwage = 0;
		 total_work_hour = 0;
		 total_working_days = 0;
		 working_hour = 0;
		 
		while(total_work_hour<=maxhourpermoth&&total_working_days<numofworkingdays) 
		{
			total_working_days++;
			random = (int) (Math.floor(Math.random()*10)%3);
			switch(random) 
			{
			case 1:
				working_hour = 8;
				dailywage = working_hour*wageperhour;
				break;
			case 2:
				working_hour = 4;
				dailywage = working_hour*wageperhour;
				break;
			default :
				working_hour = 0;
				dailywage = working_hour*wageperhour;
			}
			total_work_hour+=working_hour;
			System.out.println("Day"+" "+total_working_days+" "+"Working Hours"+working_hour+" "+"Wage "+" "+dailywage);;
		}
		int total_emp_wage = total_work_hour*wageperhour;
		System.out.println("Total Emp Wage for company  "+company+" "+"is :"+" "+total_emp_wage);
		return total_emp_wage;
	}
		public static void main(String[] args) 
		{
			Calcuclatewage("Damrt", 20, 2, 10);
			Calcuclatewage("Ril", 30, 20, 100);
		}

}
