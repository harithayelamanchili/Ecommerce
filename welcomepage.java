import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class welcomepage extends JFrame  implements ActionListener {
	JButton b1,b2;
	JLabel l1;
	
	public welcomepage() {
		super("Welcome!    Ecommerce");
		setLayout(null);
		l1=new JLabel("Please Register or Login");
		add(l1);
		l1.setBounds(20,45,500,40);
		b1=new JButton("Register");
		add(b1);
		b1.setBounds(90,160,90,30);
		b1.addActionListener(this);
		b2=new JButton("Login");
		add(b2);
		b2.setBounds(200,160,90,30);
		b2.addActionListener(this);
		}
	public void actionPerformed(ActionEvent e)  
	{  
		if(e.getSource()==b1)  
        {  
        	register r=new register();
			r.setBounds(500,300,500,500);
			r.setVisible(true);
        }
		if(e.getSource()==b2)  
        {  
        	login l=new login();
			l.setBounds(500,500,500,500);
			l.setVisible(true);
        }
}
}
