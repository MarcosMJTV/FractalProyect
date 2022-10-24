package com.marcostv.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;

import com.marcostv.model.buttonAction;
import com.marcostv.model.linea;

public class views extends JFrame{
	public JButton increase = new JButton("incremento");
	buttonAction ba = new buttonAction();

	 public views() {
	setSize(900,700);	
	setLocationRelativeTo(null);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	
}

public void accesori() {	
	increase.setBounds(50,100,110,30);
	increase.setLayout(null);
	increase.setLocation(20,10);
	increase.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	});
	this.getContentPane().add(increase);
}
	
}
