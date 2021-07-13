package com.clifford.Convertions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.json.JSONObject;
import org.json.XML;

public class Converter {

	public Converter() {}
	
	// Convert JSON file to XML
	
	@SuppressWarnings("resource")
	public void convertToXML() throws JAXBException, IOException {
		System.out.println("\nXML :");
		String link = "ab.json";
		String line = "", str = "";
		BufferedReader br = new BufferedReader(new FileReader(link));
	    while ((line = br.readLine()) != null) {   
	            str += line;
	    }
		
		JSONObject json = new JSONObject(str);
		String xml = XML.toString(json);
		System.out.println(xml);

		 File output = new File("jsontoxml.xml");
		 if(output.exists()) {
				output.delete();
			}
		    
		    BufferedWriter writer = new BufferedWriter(new FileWriter(output, true));
		    writer.append(xml);
		    
		    writer.close();
	}
	
	// Convert the XML file to JSON
	
	@SuppressWarnings("resource")
	public void convertToJSON() throws IOException {
		System.out.println("\nJSON :");
		String link = "ab.xml";
		String line = "", str = "";
	    BufferedReader br = new BufferedReader(new FileReader(link));
	    while ((line = br.readLine()) != null) {   
	            str += line;
	    }
	    
	    File output = new File("ab.json");
	    if(output.exists()) {
			output.delete();
		}
	    
	    JSONObject jsondata = XML.toJSONObject(str);
	    System.out.println(jsondata);
	    
	    BufferedWriter writer = new BufferedWriter(new FileWriter(output, true));
	    writer.append(jsondata.toString());
	    
	    writer.close();
	    
	}
	
}