package com.clifford.Data;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ConnectionReader {

	private String url;
	
	public ConnectionReader(String url) throws SAXException, IOException, ParserConfigurationException {
		this.url = url;
		downloadFile();
		processXMLFile();
	}
	
	// Download the file to process XML information
	private void downloadFile() {
		try (BufferedInputStream in = new BufferedInputStream(new URL(url).openStream());
				  FileOutputStream fileOutputStream = new FileOutputStream("ab.xml")) {
				    byte dataBuffer[] = new byte[1024];
				    int bytesRead;
				    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
				        fileOutputStream.write(dataBuffer, 0, bytesRead);
				    }
				} catch (IOException e) {}
		
	}
	
	// Get all the information from the XML file
	public void processXMLFile() throws SAXException, IOException, ParserConfigurationException {
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

	    dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);

	    DocumentBuilder db = dbf.newDocumentBuilder();

	    Document doc = db.parse(new File("ab.xml"));

	    doc.getDocumentElement().normalize();

	   NodeList list = doc.getElementsByTagName("Contact");
	          
	   for (int temp = 0; temp < list.getLength(); temp++) {
	        Node node = list.item(temp);
	        Element element = (Element) node;
	        new Person(element);
	        	  
	   }
		
	}
}
