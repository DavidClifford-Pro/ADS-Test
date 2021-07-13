package com.clifford.Convertions;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

public class XMLValidation {

	public XMLValidation() {}
	
	// Validate the XML file with the XSD file
	public boolean validate(String xmlFileName) {
		Source xmlFile = new StreamSource(new File(xmlFileName));
		SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		try {
		  Schema schema = schemaFactory.newSchema(new File("schema.XSD"));
		  Validator validator = schema.newValidator();
		  validator.validate(xmlFile);
		  System.out.println(xmlFile.getSystemId() + " is valid");
		  return true;
		} catch (SAXException e) {
		  System.out.println(xmlFile.getSystemId() + " is NOT valid reason: " + e);
		  return false;
		} catch (IOException e) {
			return false;
		}
	}
}
