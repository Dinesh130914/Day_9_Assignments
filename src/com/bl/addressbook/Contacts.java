package com.bl.addressbook;

import java.util.Scanner;

public class Contacts {
	public static void Addressbook() 
	{
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Details :");
		
		System.out.println("Enter the first name");
		String fname = sc.next();
		System.out.println("Enter the lastename");
		String lname  = sc.next();
		System.out.println("Enter the address");
		String address = sc.next();
		System.out.println("Enter the state");
		String state = sc.next();
		System.out.println("Enter the zipcode");
		String zipcode  = sc.next();
		System.out.println("Enter the contact number");
		long contctnum = sc.nextLong();
		System.out.println("Enter the mail id");
		String email = sc.next();
		sc.close();
		
		System.out.println("FirstName :"+" "+fname+"\n"+"Lastename :"+" "+lname+"\n"+"Address"+" "+address+"\n"+"Statename :"+" "+state+"\n"+"Zipcode :"+zipcode+"\n"+"Contact Number :"+contctnum+"\n"+"Email Id :"+email);
				
	}
	public static void main(String[] args)
	{
		Addressbook();
	}
}
