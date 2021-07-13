package com.clifford.Data;

import java.util.HashMap;

import javax.xml.bind.annotation.XmlRootElement;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.clifford.Main.Main;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@XmlRootElement(name="Contact")
public class Person {

	@Getter @Setter
	private String 
	customerId = "", 
	companyName = "", 
	contactName = "", 
	contactTile = "", 
	
	address = "", 
	city = "", 
	country = "", 
	postalcode = "",
	region = "",
	
	phone = "", 
	email = "", 
	fax = "";
	
	public Person(Element element) {

		for(DataTypes dataTypes : DataTypes.values()) {
        	NodeList elementsList = element.getElementsByTagName(dataTypes.getName());
        	if(elementsList.getLength() > 0) {
        		String data = elementsList.item(0).getTextContent();
        		
        		switch(dataTypes) {
        		case ADDRESS:
        			address = data;
        			break;
        		case CITY:
        			city = data;
        			break;
        		case COMPANY_NAME:
        			companyName = data;
        			break;
        		case CONTACT_NAME:
        			contactName = data;
        			break;
        		case CONTACT_TITLE:
        			contactTile = data;
        			break;
        		case COUNTRY:
        			country = data;
        			break;
        		case CUSTOMER_ID:
        			customerId = data;
        			break;
        		case EMAIL:
        			email = data;
        			break;
        		case FAX:
        			fax = data;
        			break;
        		case PHONE:
        			phone = data;
        			break;
        		case POSTAL_CODE:
        			postalcode = data;
        			break;
        		case REGION:
        			region = data;
        			break;
        		}
        		
        		
        	}
        }
		
		Main.getDirectory().addContact(this);
	}

	public Person(String customerId, String companyName, String contactName, String contactTile, String address,
			String city, String country, String postalcode, String region, String phone, String email, String fax) {
		this.customerId = customerId;
		this.companyName = companyName;
		this.contactName = contactName;
		this.contactTile = contactTile;
		this.address = address;
		this.city = city;
		this.country = country;
		this.postalcode = postalcode;
		this.region = region;
		this.phone = phone;
		this.email = email;
		this.fax = fax;
	}
	
	
 	public HashMap<DataTypes, String> convertDataToHash() {
 		HashMap<DataTypes, String> data = new HashMap<DataTypes, String>();
 		data.put(DataTypes.ADDRESS, address);
 		data.put(DataTypes.CITY, city);
 		data.put(DataTypes.COMPANY_NAME, companyName);
 		data.put(DataTypes.CONTACT_NAME, contactName);
 		data.put(DataTypes.CONTACT_TITLE, contactTile);
 		data.put(DataTypes.COUNTRY, country);
 		data.put(DataTypes.CUSTOMER_ID, customerId);
 		data.put(DataTypes.EMAIL, email);
 		data.put(DataTypes.FAX, fax);
 		data.put(DataTypes.PHONE, phone);
 		data.put(DataTypes.POSTAL_CODE, postalcode);
 		data.put(DataTypes.REGION, region);
 		
 		return data;
 		
 	}

}
