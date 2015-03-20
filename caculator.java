import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class caculator extends JFrame{
	private JPanel panel;
	private JTextField text1;
	private JButton button0;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton buttonPlus;
	private JButton buttonMinus;
	private JButton buttonMulti;
	private JButton buttonDivide;
	private JButton buttonEqual;
	String str = "0";
	Double result;
	
	public caculator() {
		super("caculator");
		setLayout(new FlowLayout());
		
		//panel = new JPanel(new GridLayout(3, 1));
		//panel.setBounds(800, 800, 200, 100);
		//add(panel);
		final JTextField text1 = new JTextField("0", 20);
		text1.setEditable(false);
		JButton button0 = new JButton("0");
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");
		JButton buttonPlus = new JButton("+");
		JButton buttonMinus = new JButton("-");
		JButton buttonMulti = new JButton("*");
		JButton buttonDivide = new JButton("/");
		JButton buttonEqual = new JButton("=");
		//button0.setSize(25, 50);
		//button9.setPreferredSize(new Dimension(30, 30));    
		//button9.setBounds(100,200,100,30);
		//Dimension d = new Dimension(100,100);
		
		//panel.add(text1);
		//panel.add(button0);
		add(text1);
		add(button0);
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
		add(button7);
		add(button8);
		add(button9);
		add(buttonPlus);
		add(buttonMinus);
		add(buttonMulti);
		add(buttonDivide);
		add(buttonEqual);
		
		button1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (str == "0")
						str="1";
					else
						str += "1";
					text1.setText(str);
				}
			}
		);
		
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (str == "0")
					str="2";
				else
					str += "2";
				text1.setText(str);
			}
		}
	);
		
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (str == "0")
					str="3";
				else
					str += "3";
				text1.setText(str);
			}
		}
	);
		
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (str == "0")
					str="4";
				else
					str += "4";
				text1.setText(str);
			}
		}
	);
		
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (str == "0")
					str="5";
				else
					str += "5";
				text1.setText(str);
			}
		}
	);
		
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (str == "0")
					str="6";
				else
					str += "6";
				text1.setText(str);
			}
		}
	);
		
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (str == "0")
					str="7";
				else
					str += "7";
				text1.setText(str);
			}
		}
	);
		
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (str == "0")
					str="8";
				else
					str += "8";
				text1.setText(str);
			}
		}
	);
		
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (str == "0")
					str="9";
				else
					str += "9";
				text1.setText(str);
			}
		}
	);
		
		buttonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					str += "+";
				text1.setText(str);
			}
		}
	);
		
		buttonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					str += "-";
				text1.setText(str);
			}
		}
	);
		
		buttonMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					str += "*";
				text1.setText(str);
			}
		}
	);
		
		buttonDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					str += "/";
				text1.setText(str);
			}
		}
	);
		
		buttonEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = "1+1";
				result = Double.parseDouble(s);
				text1.setText(result.toString());
			}
		}
	);
	}
	
	public void calc() {
		String s;
		//s = s + Double.parseDouble("1+1+1");
	}
}
