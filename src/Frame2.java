import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Frame2 extends JFrame {
	public Frame2() {
		super("Banking Systems");
		setSize(500,400);
		setVisible(true);
		
//		setLayout(new FlowLayout());
//		setLayout(new GridLayout(3,3));
		
		setLayout(new BorderLayout());
		
		JLabel nameLabel = new JLabel("Account info: ");
		nameLabel.setForeground(Color.blue);
		add(nameLabel, BorderLayout.NORTH);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(2,2));
		centerPanel.add(new JLabel("Name:"));
		JTextField tf = new JTextField(40);
		centerPanel.add(tf);		
		centerPanel.add(new JLabel("Account Number:"));
		JTextField tf2 = new JTextField(40);
		centerPanel.add(tf2);
		add(centerPanel, BorderLayout.CENTER);
		
		JPanel bottomPanel = new JPanel();	
		JButton bt = new JButton("<< Previous");
		bottomPanel.add(bt);		
		bt = new JButton("Save");
		bottomPanel.add(bt);
		bt = new JButton("Delete");
		bottomPanel.add(bt);
		bt = new JButton("Next >> ");		
		
		bottomPanel.add(bt);
		add(bottomPanel, BorderLayout.SOUTH);
		
		revalidate();
//		repaint();
		addWindowListener(new MyWindowManager());
	}

	void process() {

		int ret = JOptionPane.showConfirmDialog(null, "Do you really want to close the window?", "Close Window", 
				JOptionPane.YES_NO_OPTION);

		if(ret == JOptionPane.YES_OPTION) {
			System.out.println("Exiting");
			System.exit(0);
		}
	}
}
