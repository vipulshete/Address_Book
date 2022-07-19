package com.bridgelab.addressBook;
import java.util.Scanner;
public class AddressBook {
	
	public String firstname = "";
	public String lastname = "";
	public String address = "";
	public String city = "";
	public String state = "";
	public String mail = "";
	public int zipCode = 0;
	public int mobileNumber = 0000000000;
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to Adress Book");
		AddressBook addressBook = new AddressBook();
		addressBook.createContacts();
		addressBook.displayContact();
	}
	
	void createContacts() {
		System.out.println("Enter the person details");
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
	
	void displayContact() {
		
		System.out.print("\n" + "person details" + "\n");
		
		System.out.print("First name : " + firstname);
		System.out.print("\n" + "Last Name : " + lastname);
		System.out.print("\n" + "Address : " + address);
		System.out.print("\n" + "Mobile no. : " + mobileNumber); 
		System.out.print("\n" + "Mail : " + mail);
		System.out.print("\n" + "City : " + city); 
		System.out.print("\n" + "State : " + state);
		System.out.print("\n" + "zip code : " + zipCode);
		
		
	}
}
