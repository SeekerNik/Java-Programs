import java.awt.*;
import java.applet.Applet;
import java.awt.*;
/* <applet code="ap" width="300" height="300"> </applet> */

public class ap extends Applet
{	Label l1,l2,l3;
	TextField t1,t2;
	Button b1;
	public void init()
	{	
		l1=new Label("First Name");
		l2=new Label("Second Name");
		l3=new Label("middle name");
		t1=new TextField();
		t2=new TextField();
		
		b1=new Button("add");
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(l3);
		
	}
	
}