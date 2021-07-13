package com.clifford.Data;

import lombok.Getter;

public enum DataTypes {

	CUSTOMER_ID("CustomerID"),
	COMPANY_NAME("CompanyName"),
	CONTACT_NAME("ContactName"),
	CONTACT_TITLE("ContactTitle"),
	ADDRESS("Address"),
	CITY("City"),
	EMAIL("Email"),
	POSTAL_CODE("PostalCode"),
	REGION ("Region"),
	COUNTRY("Country"),
	PHONE("Phone"),
	FAX("Fax")
	
	;
	
	private @Getter String name;
	DataTypes(String name){
		this.name = name;
	}
}
