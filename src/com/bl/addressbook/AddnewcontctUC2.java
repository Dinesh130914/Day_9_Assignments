package com.bl.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddnewcontctUC2 {
	public  void getdetails()
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
		String contctnum = sc.next();
		System.out.println("Enter the mail id");
		String email = sc.next();
		sc.close();
		
		ArrayList<String> list = new ArrayList<>();
		list.add(fname);
		list.add(lname);
		list.add(address);
		list.add(state);
		list.add(zipcode);
		list.add(contctnum);
		list.add(email);
		
		Object[] abjarr = list.toArray();
		for (Object object : abjarr)
		{
			System.out.println((String)object);
		}
		System.out.println("Contact Added");
	}
}
