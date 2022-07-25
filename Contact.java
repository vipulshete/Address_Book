package com.bridgelab.addressBook;

public class Contact {

	private String fullName;

	private String address;

	private String email;

	private long phoneNumber;

	public Contact(String fullName, String address, String email, long phoneNumber) {
		this.fullName = fullName;
		this.address = address;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "FullName = " + fullName + " Address = " + address + " Email = " + email + " PhoneNumber = "
				+ phoneNumber;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Contact) {
			
			Contact contact = (Contact) obj;

			return fullName.equals(contact.getFullName()) && address.equals(contact.getAddress())
					&& email.equals(contact.getEmail()) && phoneNumber == contact.getPhoneNumber();

		} else {
			return false;
		
	}
	}
}
