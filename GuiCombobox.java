import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;


public class GuiCombobox extends JFrame{
	private JTextField tf;
	private JComboBox cb;
	
	public GuiCombobox() {
		super("GuiCombobox");
		setLayout(new FlowLayout());
		
		final JTextField tf = new JTextField("Blank", 20);
		add(tf);
		
		final String[] arr = {"Item A", "Item B"};
		cb = new JComboBox(arr);
		add(cb);
		
		cb.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					tf.setText(arr[cb.getSelectedIndex()]);
				}
			}
		);
	}
}
