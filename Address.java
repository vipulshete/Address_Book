
package com.bridgelab.addressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Address {

	public static void main(String args[]) {
		
		System.out.println("Welcome to Adress Book");
		
		int options = 0;
		
		
		System.out.println("\n" + "Select Opection");
		System.out.println("1. Create contact");
		System.out.println("2. Edit contact");
		System.out.println("3. Delete contact");
		
		System.out.print("\n"  + "Enter opections : " ); 
		Scanner sc = new Scanner(System.in);
		options = sc.nextInt();
		Address example = new Address();
		List<Contact> contactList = example.createContactList();
		if (options == 1) {
			
			example.printContactList(contactList);//
		
		}else if (options == 2) {
			System.out.println("Edit contact");
			
			Contact contactOne = contactList.get(0);
			Contact duplicateContactOne = contactList.get(3);
			boolean isEqual = example.checkIfEqual(contactOne, duplicateContactOne);
			
			if(isEqual) {
				System.out.println("ContactOne and duplicateContactOne are equal");
				
			} else {
				System.out.println("ContactOne and duplicateContactOne are not equal");
			}
			
			Contact contactForVipul = contactList.get(1);// get Vipuls contact at index 1
			contactForVipul.setAddress("Beed");// change address, call setAddress method to change address
			
			System.out.println("Printing list again after changing Vipul's address");
			example.printContactList(contactList);//
			//long count = example.getContactCount(contactList);// to get number of contacts in list;
			
			
			
		}else if (options == 3) {
			System.out.println("Delet contect");
			Contact contactForSurya = contactList.remove(2);// get Vipuls contact at index 1
			example.printContactList(contactList);//
		}else {
			System.out.println("Please enterss correct opction");
		}
		
	}
	
	private List<Contact> createContactList() {
		List<Contact> contactList = new ArrayList<>();
		
		Contact contactOne = createContact("Sameeksha", "Mumbai", "xyz@gmail.com", 898779897);
		contactList.add(contactOne);//0
		
		Contact contactTwo = createContact("Vipul", "Pune", "abc@gmail.com", 98823498);
		contactList.add(contactTwo);//1
		
		Contact contactThree = createContact("Surya", "Chennai", "pqr@gmail.com", 797969689);
		contactList.add(contactThree);//2
		
		Contact duplicateContactOne = createContact("Sameeksha ", "Mumbai", "xyz@gmail.com", 898779897);
		contactList.add(duplicateContactOne);// List we can duplicates//3
		
		return contactList;
	}
	
	private Contact createContact(String fullName, String address, String email, long phoneNumber) {
		return new Contact(fullName, address, email, phoneNumber);
	}
	
	private void printContactList(List<Contact> contactList) {
		
		for(Contact contact : contactList) {
			System.out.println(contact.toString());
		}
	}
	
	private boolean checkIfEqual(Contact one, Contact two) {
		return one.equals(two);
	}
	
	private long getContactCount(List<Contact> contactList) {
		return contactList.size();
	}
}
	