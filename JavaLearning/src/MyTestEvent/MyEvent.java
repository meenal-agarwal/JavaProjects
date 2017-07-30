package MyTestEvent;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyEvent extends JFrame {

	private JTextfield item1;
	private JTextfield item2;
	private JTextField item3;
	private JPasswordField passField;
	
	public myClass() {
		
		super("the title");
		setLayout(new FlowLayout());
		
		item1 = new JTextField(10);
		add(item1);
		
		item2 = new JTextField("enter text here");
		add(item2);
		
		item3 = new JTextField("uneditable",20);
		item3.setEditable(true);
		add(item3);
		
		passField = newJPasswordField("mypass");
		add(passField);
		
	}
	
}
