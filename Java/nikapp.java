import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* <applet code="nikapp" width="400" height="400"> </applet>*/
public class nikapp extends Applet implements ActionListener
{Label l1,l2;
TextField t1;
Choice c1;
Checkbox k,m;
Button b1;
	public void init()
	{
		//setLayout(null);
		setBounds(100,100,400,400);
		
		l1=new Label("Name ");
		l2=new Label("Hobby  ");
		
		t1=new TextField(50);
		
		c1=new Choice();
	    c1.add("Cricket");
	    c1.add("Football");
	    c1.add("Your Choice");
		
		k=new Checkbox("Traning");
		m=new Checkbox("coaching");
		
		b1=new Button("print");
		
		add(l1);
		add(t1);
		add(l2);
		add(c1);
		add(k);
		add(m);
		add(b1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		String a,b,c;
		
		a=t1.getText();
		System.out.println("Name :"+a);
		
		b=c1.getItem(c1.getSelectedIndex());
		System.out.println("Hobby "+b);
		
		if(k.getState() && m.getState())
		{
			System.out.println("trainer & coach");
		}
		
		else if(k.getState())
		{
			System.out.println("trainer");
		}
		else
		{
			System.out.println("coach");
		}
	}
	
}








