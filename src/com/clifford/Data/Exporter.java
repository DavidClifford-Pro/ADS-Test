package com.clifford.Data;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


import com.clifford.Main.Main;

public class Exporter {

	public Exporter() {}
	
	// Custom JSON exporter
	public void exportToJSON() throws IOException {
		File output = new File("exporter_output.json");
		if(output.exists()) {
			output.delete();
		}
	    
	    BufferedWriter writer = new BufferedWriter(new FileWriter(output, true));
	    
	    writer.write("{\"AddressBooks\": {\n");
	    writer.write("\t\"Contact\":[\n");
	    for(Person person : Main.getDirectory().getContacts()) {
	    	
	    	writer.write("{\n\t\t\"CustomerID\" : \"" + person.getCustomerId() + "\",\n");
	    	writer.write("\t\t\"CompanyName\" : \"" + person.getCompanyName() + "\",\n");
	    	writer.write("\t\t\"ContactName\" : \"" + person.getContactName() + "\",\n");
	    	writer.write("\t\t\"ContactTitle\" : \"" + person.getContactTile() + "\",\n");
	    	writer.write("\t\t\"Address\" : \"" + person.getAddress() + "\",\n");
	    	writer.write("\t\t\"City\" : \"" + person.getCity() + "\",\n");
	    	writer.write("\t\t\"Email\" : \"" + person.getEmail() + "\",\n");
	    	writer.write("\t\t\"Region\" : \"" + person.getRegion() + "\",\n");
	    	writer.write("\t\t\"PostalCode\" : \"" + person.getPostalcode() + "\",\n");
	    	writer.write("\t\t\"Country\" : \"" + person.getCountry() + "\",\n");
	    	writer.write("\t\t\"Phone\": \"" + person.getPhone() + "\",\n");
	    	writer.write("\t\t\"Fax\" : \"" + person.getFax()+ "\",\n");
	    	
	    	writer.write("\t},\n");
	    }
	    writer.write("\n]\n}\n}");
	    
	    writer.close();
		
	}
	
	// Custom XML exporter
	public void exportToXML() throws IOException {
		File output = new File("exporter_output.xml");
		if(output.exists()) {
			output.delete();
		}
	    
	    BufferedWriter writer = new BufferedWriter(new FileWriter(output, true));
	    
	    writer.write("<AddressBook>\n");
	    
	    for(Person person : Main.getDirectory().getContacts()) {
	    	writer.write("\t<Contact>\n");
	    	
	    	writer.write("\t\t<CustomerID>" + person.getCustomerId() + "</CustomerID>\n");
	    	writer.write("\t\t<CompanyName>" + person.getCompanyName() + "</CompanyName>\n");
	    	writer.write("\t\t<ContactName>" + person.getContactName() + "</ContactName>\n");
	    	writer.write("\t\t<ContactTitle>" + person.getContactTile() + "</ContactTitle>\n");
	    	writer.write("\t\t<Address>" + person.getAddress() + "</Address>\n");
	    	writer.write("\t\t<City>" + person.getCity() + "</City>\n");
	    	writer.write("\t\t<Email>" + person.getEmail() + "</Email>\n");
	    	writer.write("\t\t<Region>" + person.getRegion() + "</Region>\n");
	    	writer.write("\t\t<PostalCode>" + person.getPostalcode() + "</PostalCode>\n");
	    	writer.write("\t\t<Country>" + person.getCountry() + "</Country>\n");
	    	writer.write("\t\t<Phone>" + person.getPhone() + "</Phone>\n");
	    	writer.write("\t\t<Fax>" + person.getFax()+ "</Fax>\n");
	    	
	    	writer.write("\t</Contact>\n");
	    }
	    
	    writer.write("</AddressBook>");
	    
	    writer.close();
	}
	
}
