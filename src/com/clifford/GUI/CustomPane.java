package com.clifford.GUI;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Scrollable;

import com.clifford.Data.Person;
import com.clifford.Main.Main;

import lombok.Getter;
import lombok.Setter;

public class CustomPane extends JPanel implements Scrollable {

	private static final long serialVersionUID = 1L;

	private GridBagConstraints gbc;
	
	private @Getter @Setter JLabel pressedLabel;
	
	public CustomPane() {
		setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;

        for (Person person : Main.getDirectory().getContacts()) {
        	JLabel label = new JLabel(person.getContactName() + " (" + person.getCustomerId() + ")");
        	label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        	
    		label.addMouseListener(new MouseAdapter() {
    			@Override
    			public void mouseClicked(MouseEvent e) {
    				System.out.println("Pressed : " + label.getText());
    				// Set the data in the main GUI
    				pressedLabel = label;
    				Main.getGUI().setData(label.getText());
    				Main.getGUI().setPerson(person);
    				
    			}
    		});
        	
            add(label, gbc);
            gbc.gridy++;
        }
    }

    @Override
    public Dimension getPreferredScrollableViewportSize() {
        return new Dimension(100, 50);
    }

    @Override
    public int getScrollableUnitIncrement(Rectangle visibleRect, int orientation, int direction) {
        return 32;
    }

    @Override
    public int getScrollableBlockIncrement(Rectangle visibleRect, int orientation, int direction) {
        return 32;
    }

    @Override
    public boolean getScrollableTracksViewportWidth() {
    	try {
    		Main.getGUI().getFrmDirectory().repaint();
    	}catch(NullPointerException ex) {}
        return getPreferredSize().width <= getWidth();
    }

    @Override
    public boolean getScrollableTracksViewportHeight() {
        return false;
    }

    // Update the UI with any edited information
    public void addPerson(Person person) {
    	JLabel label = new JLabel(person.getContactName() + " (" + person.getCustomerId() + ")");
    	label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    	
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Set the data in the main GUI
				pressedLabel = label;
				Main.getGUI().setData(label.getText());
				Main.getGUI().setPerson(person);
				
			}
		});
    	
        add(label, gbc);
        gbc.gridy++;
    }
    
    
}

