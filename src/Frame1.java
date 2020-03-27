import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Frame1 implements ActionListener {

	public static void main(String[] args) {
		Frame f = new Frame();
		
		f.setVisible(true);
		f.setTitle("My Frame");
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		f.setLayout(new FlowLayout());  //Layout Manager
		Button bt = new Button("Click me");
		f.add(bt);
		Label label = new Label("Name: ");
		TextField tf = new TextField(40);
		f.add(label);
		f.add(tf);
		bt.addActionListener(new Frame1());
		f.repaint();
		f.setSize(400, 200);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Click registered");
		
	}

}
