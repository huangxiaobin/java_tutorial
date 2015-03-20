import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class GuiButton extends JFrame{
	private JButton button1;
	private JButton button2;
	private JTextField text1;
	
	public GuiButton() {
		super("GuiButton");
		setLayout(new FlowLayout());
		
		final JTextField text1 = new JTextField("0", 20);
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		//JButton button3 = new JButton("3");
		
		text1.setEditable(false);
		text1.setBounds(20,80,170,20);
		add(text1);
		add(button1);
		add(button2);
		//add(button3);
		
		//button1.addActionListener(handler);
		button1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					text1.setText("1");
				}
			}
		);
		
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text1.setText("2");
				}
			}
		);
		
	}
	
}
