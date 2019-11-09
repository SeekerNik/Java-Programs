package AppletsInJava;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//<applet code="MyApplet.class" width="200" height="220" ></applet>
//if you don't write this html line above then also the code is run because the ecl
public class MyApplet extends Applet
{
	Label l1,l2,l3;
	TextField t1,t2;
	Button b1;
	
	public void init()
	{
		l1=new Label("Name");
		l2=new Label("class");
		l3=new Label();
		t1=new TextField();
		t2=new TextField();
		b1=new Button("submit");
		//setLayout(null);
		//Default layout is flow layout which will run when we didn't set our layout
		//l1.setBounds(20, 20,40,40);
	
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(l3);
		b1.addActionListener(new Ac());
	}
	public class Ac implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			// TODO Auto-generated method stub
			int a,b;
		     int c;
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			c=a+b;
			l3.setText("sum is : "+c);;//this will automaticaly convert the int c to string 
			//this is wrong because it takes only string type args l3.setText(c);
		}
		
	}
}