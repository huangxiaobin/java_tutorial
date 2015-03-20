import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class GuiList extends JFrame{
	private JList lo;
	private JTextField tf;
	
	public GuiList() {
		super("GuiList");
		setLayout(new FlowLayout());
		
		final JTextField tf = new JTextField("Blank", 20);
		add(tf);
		
		final String[] arr = {"Item A", "Item B", "Item C", "Item D"};
		
		lo = new JList(arr);
		lo.setVisibleRowCount(4);
		lo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(lo));
		
		lo.addListSelectionListener(
			new ListSelectionListener() {
				public void valueChanged(ListSelectionEvent event) {
					tf.setText(arr[lo.getSelectedIndex()]);
				}
			}
		);
	}
}
