package com.clifford.GUI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import com.clifford.Data.Comparison;
import com.clifford.Data.Exporter;
import com.clifford.Data.Person;
import com.clifford.Main.Main;

import lombok.Getter;
import lombok.Setter;

import java.awt.Font;

import javax.swing.JScrollPane;
import java.awt.TextField;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class GUI {

	private @Getter JFrame frmDirectory;

	private @Getter CustomPane customPane;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private TextField customerID;
	private TextField company;
	private TextField name;
	private JLabel lblNewLabel_4;
	private TextField title;
	private JLabel lblNewLabel_5;
	private TextField address;
	private JLabel lblNewLabel_6;
	private TextField city;
	private JLabel lblNewLabel_7;
	private TextField country;
	private JLabel lblNewLabel_8;
	private TextField zipCode;
	private JLabel lblNewLabel_9;
	private TextField phone;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private TextField fax;
	private JLabel lblNewLabel_12;
	private TextField email;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem resetPerson;
	private JMenuItem savePerson;
	private JMenuItem toggleEditing;
	
	private TextField region;
	private JLabel region23;
	
	private @Getter boolean editing = false;
	
	private @Getter @Setter Person person;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenu mnNewMenu_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_3;
	private JMenu mnNewMenu_2;
	private JMenuItem mntmNewMenuItem_4;
	
	public GUI() {
		initialize();
		frmDirectory.setVisible(true);
	}

	
	private void initialize() {
		frmDirectory = new JFrame();
		frmDirectory.setForeground(Color.GREEN);
		frmDirectory.setResizable(false);
		frmDirectory.getContentPane().setBackground(Color.GRAY);
		frmDirectory.setTitle("Directory");
		frmDirectory.setBounds(100, 100, 813, 590);
		frmDirectory.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDirectory.getContentPane().setLayout(null);
		
		region = new TextField();
		region.setForeground(Color.RED);
		region.setBounds(553, 283, 226, 32);
		frmDirectory.getContentPane().add(region);
		
		address = new TextField();
		address.setForeground(Color.RED);
		address.setBounds(553, 71, 226, 32);
		frmDirectory.getContentPane().add(address);
		
		city = new TextField();
		city.setForeground(Color.RED);
		city.setBounds(553, 127, 226, 32);
		frmDirectory.getContentPane().add(city);
		
		country = new TextField();
		country.setForeground(Color.RED);
		country.setBounds(553, 183, 226, 32);
		frmDirectory.getContentPane().add(country);
		
		zipCode = new TextField();
		zipCode.setForeground(Color.RED);
		zipCode.setBounds(553, 235, 226, 32);
		frmDirectory.getContentPane().add(zipCode);
		
		fax = new TextField();
		fax.setForeground(Color.RED);
		fax.setBounds(553, 362, 227, 32);
		frmDirectory.getContentPane().add(fax);
		
		email = new TextField();
		email.setForeground(Color.RED);
		email.setBounds(287, 422, 199, 32);
		frmDirectory.getContentPane().add(email);
		
		phone = new TextField();
		phone.setForeground(Color.RED);
		phone.setBounds(287, 362, 199, 32);
		frmDirectory.getContentPane().add(phone);
		
		title = new TextField();
		title.setForeground(Color.RED);
		title.setBounds(287, 235, 199, 32);
		frmDirectory.getContentPane().add(title);
		
		company = new TextField();
		company.setForeground(Color.RED);
		company.setBounds(287, 183, 199, 32);
		frmDirectory.getContentPane().add(company);
		
		name = new TextField();
		name.setForeground(Color.RED);
		name.setBounds(287, 127, 199, 32);
		frmDirectory.getContentPane().add(name);
		
		customerID = new TextField();
		customerID.setForeground(Color.RED);
		customerID.setBounds(287, 71, 199, 32);
		frmDirectory.getContentPane().add(customerID);
		
		JLabel lblNewLabel = new JLabel("Directory");
		
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(414, 11, 130, 39);
		frmDirectory.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane(customPane = new CustomPane());
		scrollPane.setEnabled(false);
		scrollPane.setBounds(10, 11, 196, 521);
		
		frmDirectory.getContentPane().add(scrollPane);
		
		lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setBounds(216, 61, 52, 50);
		frmDirectory.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setBounds(216, 117, 52, 50);
		frmDirectory.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Company");
		lblNewLabel_3.setBounds(216, 173, 65, 50);
		frmDirectory.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Title");
		lblNewLabel_4.setBounds(216, 229, 52, 50);
		frmDirectory.getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Address");
		lblNewLabel_5.setBounds(492, 61, 52, 50);
		frmDirectory.getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("City");
		lblNewLabel_6.setBounds(492, 117, 52, 50);
		frmDirectory.getContentPane().add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Country");
		lblNewLabel_7.setBounds(492, 173, 52, 50);
		frmDirectory.getContentPane().add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("ZIP");
		lblNewLabel_8.setBounds(492, 229, 52, 50);
		frmDirectory.getContentPane().add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("Phone");
		lblNewLabel_9.setBounds(216, 355, 52, 50);
		frmDirectory.getContentPane().add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("Contact Information");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setBounds(414, 306, 206, 50);
		frmDirectory.getContentPane().add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("Fax");
		lblNewLabel_11.setBounds(492, 355, 52, 50);
		frmDirectory.getContentPane().add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("Email");
		lblNewLabel_12.setBounds(216, 416, 52, 50);
		frmDirectory.getContentPane().add(lblNewLabel_12);
		
		region23 = new JLabel("Region");
		region23.setBounds(492, 273, 52, 50);
		frmDirectory.getContentPane().add(region23);
		
		menuBar = new JMenuBar();
		frmDirectory.setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("Admin");
		menuBar.add(mnNewMenu);
		
		toggleEditing = new JMenuItem("Toggle Editing");
		toggleEditing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(editing) {
					editing = false;
					
				}else {
					editing = true;
				}
				
				name.setEditable(editing);
				customerID.setEditable(editing);
				title.setEditable(editing);
				company.setEditable(editing);
				
				address.setEditable(editing);
				city.setEditable(editing);
				country.setEditable(editing);
				zipCode.setEditable(editing);
				
				email.setEditable(editing);
				phone.setEditable(editing);
				fax.setEditable(editing);
				
				getFrmDirectory().repaint();
				
				
			}
		});
		mnNewMenu.add(toggleEditing);
		
		savePerson = new JMenuItem("Save Person");
		savePerson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(person != null) {
					System.out.println("Saving user...");
					
					person.setContactName(name.getText());
					person.setCompanyName(company.getText());
					person.setCustomerId(customerID.getText());
					person.setContactTile(title.getText());
					
					person.setAddress(address.getText());
					person.setCity(city.getText());
					person.setRegion(region23.getText());
					person.setPostalcode(zipCode.getText());
					person.setCountry(country.getText());
					
					person.setPhone(phone.getText());
					person.setFax(fax.getText());
					person.setEmail(email.getText());
					
				}else {
					// We don't have a person that matches these, meaning it's new
					System.out.println("Creating new person");
					Person person1 = new Person(
							customerID.getText(), 
							company.getText(), 
							name.getText(), 
							title.getText(), 
							address.getText(), 
							city.getText(), 
							country.getText(), 
							zipCode.getText(), 
							region.getText(), 
							phone.getText(), 
							email.getText(), 
							fax.getText()
							);
		
					Main.getDirectory().addContact(person1);
					
					// Update UI
					Main.getGUI().getCustomPane().addPerson(person1);
				}
			}
		});
		mnNewMenu.add(savePerson);
		
		resetPerson = new JMenuItem("Reset Person");
		resetPerson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(person != null) {
					System.out.println("Resetting user...");
					setData(person.getCompanyName() + " (" + person.getCustomerId() + ")");
				}else {
					nullify();
				}
			}
		});
		mnNewMenu.add(resetPerson);
		
		mntmNewMenuItem = new JMenuItem("Add Person");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				person = null;
				nullify();
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		mntmNewMenuItem_1 = new JMenuItem("Remove Person");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Removing person...");
				Main.getDirectory().removeContact(person);
				getCustomPane().remove(getCustomPane().getPressedLabel());
				nullify();
				person = null;
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		mnNewMenu_1 = new JMenu("Exporter");
		menuBar.add(mnNewMenu_1);
		
		mntmNewMenuItem_2 = new JMenuItem("Export To JSON");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Exporting to JSON");
				try {
					new Exporter().exportToJSON();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		mntmNewMenuItem_3 = new JMenuItem("Export To XML");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Exporting to XML");
				try {
					new Exporter().exportToXML();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		mnNewMenu_2 = new JMenu("Comparison");
		menuBar.add(mnNewMenu_2);
		
		mntmNewMenuItem_4 = new JMenuItem("Scan For Similarities");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Looking for similarities");
				new Comparison();
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_4);
	}
	
	// Set the data values
	public void setData(String pressedItem) {
		for(Person person : Main.getDirectory().getContacts()) {
			String match = person.getContactName() + " (" + person.getCustomerId() + ")";
			
			// We have a match
			if(match.equals(pressedItem)) {
				System.out.println("Match found");
				
				name.setText(person.getContactName());
				customerID.setText(person.getCustomerId());
				title.setText(person.getContactTile());
				company.setText(person.getCompanyName());
				
				address.setText(person.getAddress());
				city.setText(person.getCity());
				country.setText(person.getCountry());
				zipCode.setText(person.getPostalcode());
				region.setText(person.getRegion());
				
				email.setText(person.getEmail());
				phone.setText(person.getPhone());
				fax.setText(person.getFax());
				
				name.setEditable(editing);
				customerID.setEditable(editing);
				title.setEditable(editing);
				company.setEditable(editing);
				
				address.setEditable(editing);
				city.setEditable(editing);
				country.setEditable(editing);
				zipCode.setEditable(editing);
				region.setEditable(editing);
				
				email.setEditable(editing);
				phone.setEditable(editing);
				fax.setEditable(editing);
				
				getFrmDirectory().repaint();
				break;
			}
			
		}
		
	}
	
	public void nullify() {
		name.setText("");
		customerID.setText("");
		title.setText("");
		company.setText("");
		
		address.setText("");
		city.setText("");
		country.setText("");
		zipCode.setText("");
		region.setText("");
		
		email.setText("");
		phone.setText("");
		fax.setText("");
		getFrmDirectory().repaint();
	}
}
