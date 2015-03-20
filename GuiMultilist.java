import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class GuiMultilist extends JFrame{
	private JList leftList;
	private JList rightList;
	private JButton bo;
	
	public GuiMultilist() {
		super("GuiMultilist");
		setLayout(new FlowLayout());
		
		final String[] arr = {"Item A", "Item B", "Item C", "Item D", "Item E", "Item F"};
		
		leftList = new JList(arr);
		leftList.setVisibleRowCount(4);
		leftList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(leftList));
		
		bo = new JButton("move-->");
		bo.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						rightList.setListData(leftList.getSelectedValues());
					}
				}
		);
		add(bo);
		
		rightList = new JList();
		rightList.setVisibleRowCount(4);
		rightList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(rightList));
	}
}
