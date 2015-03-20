import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class GuiMouse extends JFrame{
	private JPanel mousePanel;
	private JLabel statusBar;
	
	public GuiMouse() {
		super("GuiMultilist");
		//setLayout(new FlowLayout());
		
		mousePanel = new JPanel();
		mousePanel.setBackground(Color.WHITE);
		add(mousePanel, BorderLayout.CENTER);
		
		statusBar = new JLabel("default");
		add(statusBar, BorderLayout.SOUTH);
		addMouseListener(new MouseClass());
		/*
		mousePanel.addMouseListener(new MouseListener(){
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					statusBar.setText("mouseClicked");
				}

				@Override
				public void mousePressed(MouseEvent e) {
					statusBar.setText("mousePressed");
				}
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					statusBar.setText("mouseReleased");
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					statusBar.setText("mouseEntered");
					mousePanel.setBackground(Color.RED);
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					statusBar.setText("mouseExited");
					mousePanel.setBackground(Color.WHITE);
				}
				
			}
		);
				
		mousePanel.addMouseMotionListener(new MouseMotionListener(){
				@Override
				public void mouseDragged(MouseEvent arg0) {
					// TODO Auto-generated method stub
					statusBar.setText("mouseDragged");
				}
	
				@Override
				public void mouseMoved(MouseEvent arg0) {
					// TODO Auto-generated method stub
					statusBar.setText("mouseMoved");
				}
			
			}
		);
		*/
	}
	
	class MouseClass extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			statusBar.setText("mouseClicked " + e.getClickCount());
		}
	}
}
