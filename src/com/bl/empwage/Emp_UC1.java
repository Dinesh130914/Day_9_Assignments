package com.bl.empwage;

public class Emp_UC1 {
	static int is_present,random;
	public static void main(String[] args)
	{
		 is_present =1;
		 random = (int) (Math.floor(Math.random()*10)%2);
		 Empattendence();
	}
	
	public static void Empattendence() 
	{
		if(random==is_present) 
		{
			System.out.println("Employee is present");
		}else 
		{
			System.out.println("Employee is absent");
		}
	}
}
