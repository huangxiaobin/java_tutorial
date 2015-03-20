
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuiRadiobutton extends JFrame{
	private JTextField tf;
	private Font f1;
	private Font f2;
	private Font f3;
	private Font f4;
	
	private JRadioButton rb1;
	private JRadioButton rb2;
	private JRadioButton rb3;
	private JRadioButton rb4;
	
	private ButtonGroup bg;
	
	public GuiRadiobutton() {
		super("GuiRadiobutton");
		setLayout(new FlowLayout());
		
		f1 = new Font("Serif", Font.BOLD, 14);
		f2 = new Font("Serif", Font.ITALIC, 14);
		f3 = new Font("Serif", Font.BOLD+Font.ITALIC, 14);
		f4 = new Font("Serif", Font.PLAIN, 14);
		
		final JTextField tf = new JTextField("show some message", 20);
		add(tf);
		tf.setFont(f4);
		
		rb1 = new JRadioButton("bold");
		rb2 = new JRadioButton("italic");
		rb3 = new JRadioButton("bold+italic");
		rb4 = new JRadioButton("plain");
		add(rb1);
		add(rb2);
		add(rb3);
		add(rb4);
		
		bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		bg.add(rb4);
				
		//myListener listener = new myListener();
		rb1.addItemListener(new ItemListener(){
				public void itemStateChanged(ItemEvent e) {
					tf.setFont(f1);
				}
			}
		);
		
		rb2.addItemListener(new ItemListener(){
				public void itemStateChanged(ItemEvent e) {
					tf.setFont(f2);
				}
			}
		);

		rb3.addItemListener(new ItemListener(){
				public void itemStateChanged(ItemEvent e) {
					tf.setFont(f3);
				}
			}
		);

		rb4.addItemListener(new ItemListener(){
				public void itemStateChanged(ItemEvent e) {
					tf.setFont(f4);
				}
			}
		);
	}
}
