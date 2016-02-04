import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class register extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,head;
	JTextField t1,t2,t3,t4,t5,t6,t7;
	JPasswordField t8,t9;
	JButton b1,b2;
	
public	register()
	{
		super("Welcome! Ecommerce Registration Page");
		setLayout(null);   	 			
		
		head=new JLabel("Registration");
		head.setBounds(270,30,600,50);
		head.setFont(new Font("Times New Roman",Font.BOLD,30));
		add(head);	
		
		l1=new JLabel("First Name");
		l1.setBounds(150,110,100,30);
		add(l1);
		t1=new JTextField();
		t1.setHorizontalAlignment (JTextField.LEFT);
		t1.setBounds(280,114,170,25);
		add(t1);

		l2=new JLabel("Last Name");
		l2.setBounds(150,170,100,30);
		add(l2);
		t2=new JTextField();
		t2.setHorizontalAlignment (JTextField.LEFT);
		t2.setBounds(280,174,170,25);
		add(t2);
		
		l3=new JLabel("Address");
		l3.setBounds(150,230,100,30);
		add(l3);
		t3=new JTextField();
		t3.setHorizontalAlignment (JTextField.RIGHT);
		t3.setBounds(280,234,170,25);
		add(t3);

		l4=new JLabel("Telephone or");
		l4.setBounds(150,274,100,30);
		add(l4);
		t4=new JTextField();
		t4.setHorizontalAlignment (JTextField.LEFT);
		t4.setBounds(280,294,170,25);
		add(t4);
		l10=new JLabel("Mobile Phone");
		l10.setBounds(150,304,100,30);
		add(l10);

		l5=new JLabel("Work Phone");
		l5.setBounds(150,354,100,30);
		add(l5);
		t5=new JTextField();
		t5.setHorizontalAlignment (JTextField.RIGHT);
		t5.setBounds(280,354,170,25);
		add(t5);

		l6=new JLabel("Email Address");
		l6.setBounds(150,414,100,30);
		add(l6);
		t6=new JTextField();
		t6.setHorizontalAlignment (JTextField.RIGHT);
		t6.setBounds(280,414,170,25);
		add(t6);
		
		l7=new JLabel("User Name");
		l7.setBounds(150,474,100,30);
		add(l7);
		t7=new JTextField();
		t7.setHorizontalAlignment (JTextField.LEFT);
		t7.setBounds(280,474,170,25);
		add(t7);
		
		l8=new JLabel("Password");
		l8.setBounds(150,534,100,30);
		add(l8);
		t8=new JPasswordField();
		t8.setHorizontalAlignment (JTextField.LEFT);		
		t8.setBounds(280,534,170,25);
		add(t8);

		l9=new JLabel("Verify Password");
		l9.setBounds(150,604,100,30);
		add(l9);
		t9=new JPasswordField();
		t9.setHorizontalAlignment (JTextField.LEFT);
		t9.setBounds(280,604,170,25);
		add(t9);

		b1=new JButton("Register");
		b1.setBounds(280,664,100,30);
		add(b1);

		b2=new JButton("Clear");
		b2.setBounds(440,664,100,30);
		add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}
}
