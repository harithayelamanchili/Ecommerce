import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class login extends JFrame implements ActionListener
{
	
	JButton b1,b2;
	JLabel l1,l2,head;
	JTextField t1,t2;
	login()
	{
		super("Welcome! Ecommerce Login page");
		setLayout(null);
		head=new JLabel("Login");
		head.setBounds(170,10,500,50);
		head.setFont(new Font("Times New Roman",Font.BOLD,30));
		add(head);
		
		l1=new JLabel("User Name");
		add(l1);
		l1.setBounds(20,75,100,30);
				
		t1=new JTextField();
		add(t1);
		t1.setBounds(110,85,150,20);

		setLayout(null);
		l2=new JLabel("Password");
		add(l2);
		l2.setBounds(20,105,100,30);
		
		t2=new JPasswordField();
		add(t2);
		t2.setBounds(110,115,150,20);
		
		b1=new JButton("Login");
		add(b1);
		b1.setBounds(90,170,90,30);

		b1.addActionListener(this);
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		
			
	}
