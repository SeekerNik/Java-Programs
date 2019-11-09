package SwingsInJava;
import java.awt.TextField;
import java.util.*;

import javax.swing.*;

public class loginId extends JFrame
{
	JLabel l1,l2,l3,l4;
	JTextField t1,t2;
	
	JButton b1;
	loginId()
	{
	}
	loginId(String s)
	{
		super(s);
	}
	
	public void setcomponents()
	{
		l1=new JLabel("Email :");
		l2=new JLabel("Password :");
		l3=new JLabel("Succesfully Login");
		l4=new JLabel("Error in Login");
		t1=new JTextField();
		t2=new JTextField();
		b1=new JButton("Login");
		setLayout(null);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(t1);
		add(t2);
		add(b1);
	}
	
	public static void main (String args[])
	{
		loginId ld=new loginId("Login");
		
		ld.setcomponents();
		ld.setSize(500,500);
		ld.setVisible(true);
		
		
		
		
	}
}
