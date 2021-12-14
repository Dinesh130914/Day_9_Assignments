package com.bl.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class Deleteusingname {
	public static void remove(String fName, String lName, String address,  String state, String zipcode, String contcnumber, String email) 
	{
		ArrayList<String> list = new ArrayList<>();
		
		list.add(fName);
		list.add(lName);
		list.add(address);
		list.add(state);
		list.add(zipcode);
		list.add(contcnumber);
		list.add(email);
		
		for (int i = 0; i < 1; i++) {
			System.out.println("Your Address Book :"+list);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the  Firstname");
			String fname = sc.next();
			list.remove(0);
			
			System.out.println("Successfully Edited");
			
		}
		System.out.println("Edited Address Book "+list);
	}
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first name");
		String fName = sc.next();
		System.out.println("Enter the lastename");
		String lName  = sc.next();
		System.out.println("Enter the address");
		String address = sc.next();
		System.out.println("Enter the state");
		String state = sc.next();
		System.out.println("Enter the zipcode");
		String zipcode  = sc.next();
		System.out.println("Enter the contact number");
		String contctnumber = sc.next();
		System.out.println("Enter the mail id");
		String email = sc.next();
		
		remove(fName, lName, address, state, zipcode, contctnumber, email);
	}
}
