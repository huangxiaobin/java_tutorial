
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class GuiCheckbox extends JFrame{
	public JTextField tf;
	public JCheckBox cb1;
	public JCheckBox cb2;
	
	public GuiCheckbox() {
		super("GuiCheckbox");
		setLayout(new FlowLayout());
		
		final JTextField tf = new JTextField("show some message", 20);
		final JCheckBox cb1 = new JCheckBox("bold");
		final JCheckBox cb2 = new JCheckBox("italics");
		add(tf);
		add(cb1);
		add(cb2);
		
		cb1.addItemListener(new ItemListener(){
				public void itemStateChanged(ItemEvent e) {
					Font font = null;
					if (cb1.isSelected() && cb2.isSelected()) {
						font = new Font("Serif", Font.BOLD+Font.ITALIC, 14);
					} else if(cb1.isSelected()){
						font = new Font("Serif", Font.BOLD, 14);
					} else if (cb2.isSelected()){
						font = new Font("Serif", Font.ITALIC, 14);
					} else {
						font = new Font("Serif", Font.PLAIN, 14);
					}
					
					tf.setFont(font);
				}
			}
		);
		
		cb2.addItemListener(new ItemListener(){
				public void itemStateChanged(ItemEvent e) {
					Font font = null;
					if (cb1.isSelected() && cb2.isSelected()) {
						font = new Font("Serif", Font.BOLD+Font.ITALIC, 14);
					} else if(cb1.isSelected()){
						font = new Font("Serif", Font.BOLD, 14);
					} else if (cb2.isSelected()){
						font = new Font("Serif", Font.ITALIC, 14);
					} else {
						font = new Font("Serif", Font.PLAIN, 14);
					}
					
					tf.setFont(font);
				}
			}
		);
	}
}
