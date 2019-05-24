package applet;

import java.awt.*;
import java.applet.Applet;
/* <applet code="EventIn" width="200" height="200"> </applet> */

public class app extends Applet 
{	Label l1,l2;
	TextField t1,t2;
	Button b1;
	public void init()
	{
		l1=new Label("First Name");
		l2=new Label("Second Name");
		
		t1=new TextField();
		t2=new TextField();
		
		b1=new Button("add");
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		
	}
	
	
}