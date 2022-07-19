package com.bridgelab.addressBook;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class AddressBook {
	
	public String firstname = "";
	public String lastname = "";
	public String address = "";
	public String city = "";
	public String state = "";
	public String mail = "";
	public int zipCode = 0;
	public int mobileNumber = 0000000000;
	
	public static Scanner sc = new Scanner(System.in);
	
	public static AddressBook addressBook = new AddressBook();
	
	public static void main(String[] args) {
		System.out.println("Welcome to Adress Book");
		
		int options = 0;
		
		System.out.println("\n" + "Select Opection");
		System.out.println("1. Create contact" + "\n" );
		
		System.out.print("Enter opections : " ); 
		options = sc.nextInt();
		
		if (options == 1) {

			addressBook.createContacts();
			addressBook.displayContact();
		
		}
	
		
	}
	
	void addContact( ) {
		addressBook.createContacts();
		addressBook.displayContact();
	}
	
	void createContacts() {
		System.out.println("\n" + "Enter the person details" + "\n");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("First Name : " ); 
		firstname = sc.nextLine();
		
		System.out.print("Last Name : " ); 
		lastname = sc.nextLine();
		
		System.out.print("Address : " ); 
		address = sc.nextLine();
		
		System.out.print("City : " ); 
		city = sc.nextLine();
		
		System.out.print("State : " ); 
		state = sc.nextLine();
		
		System.out.print("Mail : " ); 
		mail = sc.nextLine();
		
		System.out.print("zip code : " ); 
		zipCode = sc.nextInt();
		
		System.out.print("Mobile no. : " ); 
		mobileNumber = sc.nextInt();
		
		System.out.print("\n" + "Detail enter sucessfully" + "\n"); 
		
		
	}
	
	 public void displayContact() {
		 
		System.out.print("\n" + "person details" + "\n");
		System.out.print("\n" + "First name : " + firstname);
		System.out.print("\n" + "Last Name : " + lastname);
		System.out.print("\n" + "Address : " + address);
		System.out.print("\n" + "Mobile no. : " + mobileNumber); 
		System.out.print("\n" + "Mail : " + mail);
		System.out.print("\n" + "City : " + city); 
		System.out.print("\n" + "State : " + state);
		System.out.print("\n" + "zip code : " + zipCode);
		
	}
}
