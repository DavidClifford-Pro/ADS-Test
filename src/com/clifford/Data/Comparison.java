package com.clifford.Data;

import java.util.ArrayList;
import java.util.HashMap;

import com.clifford.Main.Main;

public class Comparison {

	// Map filled with all the comparison data
	private HashMap<DataTypes, HashMap<Integer, ArrayList<Person>>> comparisonMap = new HashMap<DataTypes, HashMap<Integer, ArrayList<Person>>>();
	
	public Comparison() {
		compare();
	}
	
	// Loop through all the data types of the system
	// For each of the data types, compares them to the other of other people
	// If a value matches, put it in an arraylist with the other matches
	// If they don't match, put the contact into another arraylist by itself
	
	private void compare() {
		for(Person person : Main.getDirectory().getContacts()) {
			
			HashMap<DataTypes, String> dataHash = person.convertDataToHash();
			
			for(DataTypes type : dataHash.keySet()) {
				if(comparisonMap.containsKey(type)) {
					HashMap<Integer, ArrayList<Person>> map = comparisonMap.get(type);
					// Get all the arraylists
					for(int x : map.keySet()) {
						// Get all the persons in the list
						for(Person p1 : map.get(x)) {
							HashMap<DataTypes, String> p1Hash = p1.convertDataToHash();
							if(p1Hash.get(type).equals(dataHash.get(type))) {
								// We have a match!
								
							}
						}
					}
				}else {
					
				}
				
			}
						
		}
		
		print();
	}
	
	private void print() {
		System.out.println("----Data----");
		for(DataTypes type : comparisonMap.keySet()) {
			HashMap<Integer, ArrayList<Person>> map = comparisonMap.get(type);
			for(int x : map.keySet()) {
				if(map.get(x).size() > 1) {
					// Print this, it is a match
					System.out.println("Located Matches For: " + type);
					for(Person person : map.get(0)) {
						HashMap<DataTypes, String> dataHash = person.convertDataToHash();
						System.out.println(dataHash.get(type));
					}
					System.out.println("------------");
				}
			}
			
			
		}
	}
	
}
