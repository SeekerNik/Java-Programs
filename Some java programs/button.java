package layouts;
import java.awt.*;
import java.awt.event.*;

class button1 extends Frame implements ActionListener
{
	Button b1,b2;
	button1()
	{	setLayout(null);
		setBounds(100,100,400,400);
		b1=new Button("B1");
		b1.setBounds(50,50,100,100);
		add(b1);
		b1.addActionListener(this);
		
		b2=new Button("B2");
		b2.setBounds(150,150,100,100);
		add(b2);
		b2.addActionListener(this);
		setVisible(true);
		
		
	}
	
	public void actionPerformed(ActionEvent e)
		{ String str=e.getActionCommand();
			
				if(str.equals("B2"))
				{
					b1.setBounds(25,25,50,50);
				b2.setBounds(150,150,100,100);
				}
				
				else if(str.equals("B1"))
				{
				b2.setBounds(200,200,50,50);
				b1.setBounds(50,50,100,100);
				}
		}
}

public class button
{
public static void main(String arg[])
{
	button1 b=new button1();
}
}