import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/* <applet code="Myapplet.java" width="300" height="300"> </applet> */

public class Myapplet extends Applet
{	Label l1,l2,l3;
	TextField t1,t2;
	Button b1;
	int s;
	public void init()
	{	
		l1=new Label("First Name");
		l2=new Label("Second Name");
		l3=new Label();
		t1=new TextField();
		t2=new TextField();
		
		b1=new Button("add");
		//setLayout(null);
		/*l1.setBounds(50,50,50,30);
		t1.setBounds(50,150,50,30);
		l2.setBounds(50,100,50,30);
		t2.setBounds(100,150,50,30);
		b1.setBounds(150,150,50,30);
		l3.setBounds(150,180,150,30);*/
		
	
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(l3);
		b1.addActionListener(new MyHandler());
		setVisible(true);
	}
	
		public class MyHandler implements ActionListener
		{
		public void actionPerformed(ActionEvent e)
		{int a,b;
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			s=a+b;
			l3.setText("the sum is :"+s);
		
		}
		}
	
}