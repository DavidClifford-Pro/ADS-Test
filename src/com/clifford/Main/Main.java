package com.clifford.Main;

import java.io.IOException;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;

import org.json.simple.parser.ParseException;
import org.xml.sax.SAXException;

import com.clifford.Convertions.Converter;
import com.clifford.Convertions.XMLValidation;
import com.clifford.Data.ConnectionReader;
import com.clifford.Data.Directory;
import com.clifford.GUI.GUI;

public class Main {

	// Creates a directory
	private static Directory directory;
	
	private static GUI gui;
	
	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException, JAXBException {
		directory = new Directory();
		new ConnectionReader("http://www.bindows.net/documentation/download/ab.xml");
		
		System.out.println("Successfully loaded: " + directory.getContacts().size() + " contacts.");
		
		// Convert to JSON file like requested
		new Converter().convertToJSON();
		
		// Convert the new JSON back to XML like requested
		new Converter().convertToXML();
		
		// Validate XML Files
		// Start with original file
		
		XMLValidation validate = new XMLValidation();
		
		validate.validate("ab.xml");
		
		validate.validate("jsontoxml.xml");
		
		
		// Create GUI to view/process/edit the data
		gui = new GUI();
	}
	
	// Get the directory
	public static Directory getDirectory() {
		return directory;
	}
	
	// Get the GUI that was created
	public static GUI getGUI() {
		return gui;
	}
}