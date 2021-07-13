package com.clifford.Data;

import java.util.ArrayList;

import lombok.Getter;

public class Directory {

	private @Getter ArrayList<Person> contacts = new ArrayList<Person>();
	
	public Directory() {}
	
	// Remove person from the directory
	public void addContact(Person person) {
		if(!contacts.contains(person)) {
			contacts.add(person);
		}
	}
	
	// Remove a person from the directory
	public void removeContact(Person person) {
		if(contacts.contains(person)) {
			contacts.remove(person);
		}
	}
	
}
