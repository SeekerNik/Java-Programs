package layouts;
import java.awt.*;
import java.awt.event.*;
class A extends Frame implements ActionListener
{
boolean east1 = false,west1 = false,north1 = false,south1 = false,center1 = false;

Button north,south ,west,center,east;
	A()
	{
		center=new Button("Center");
		add(center);
		
		north=new Button("North");
		add(north,BorderLayout.NORTH);
		setVisible(true);
		north.addActionListener(this);
		south=new Button("South");
		add(south,BorderLayout.SOUTH);
		
		east=new Button("East");
		add(east,BorderLayout.EAST);
		
		west=new Button("West");
		add(west,BorderLayout.WEST);
		south.addActionListener(this);
		center.addActionListener(this);
		east.addActionListener(this);
		west.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String s1=e.getActionCommand();
		if(s1.equals("North"))
		{
			north1=true;
			
		}
		
		if(s1.equals("South"))
		{
			south1=true;
			
		}
		
		if(s1.equals("East"))
		{
			east1=true;
			
		}
		
		if(s1.equals("West"))
		{
			west1=true;
			
		}
		
		if(s1.equals("Center"))
		{
			center1=true;
			
		}
		
		
		
		if(north1&&south1)
		{
			
			String temp=north.getLabel();
			north.setLabel(south.getLabel());
			south.setLabel(temp);
			
			north1=south1=false;
		
		}
		
		if(north1&&west1)
		{
			
			String temp=north.getLabel();
			north.setLabel(west.getLabel());
			west.setLabel(temp);
			
			north1=west1=false;
		
		}
		
		if(north1&&center1)
		{
			
			String temp=north.getLabel();
			north.setLabel(center.getLabel());
			center.setLabel(temp);
			
			north1=center1=false;
		
		}
		
		if(north1&&east1)
		{
			
			String temp=north.getLabel();
			north.setLabel(east.getLabel());
			east.setLabel(temp);
			
			north1=east1=false;
		
		}
		
		if(east1&&south1)
		{
			
			String temp=north.getLabel();
			east.setLabel(south.getLabel());
			south.setLabel(temp);
			
			east1=south1=false;
		
		}
		
		if(east1&&west1)
		{
			String temp=east.getLabel();
			east.setLabel(west.getLabel());
			west.setLabel(temp);
			east1=west1=false;
		}
		
		if(east1&&center1)
		{
			String temp=east.getLabel();
			east.setLabel(center.getLabel());
			center.setLabel(temp);
			east1=center1=false;
		}
		if(south1&&center1)
		{
			String temp=south.getLabel();
			south.setLabel(center.getLabel());
			center.setLabel(temp);
			south1=center1=false;
		}
		
		if(south1&&west1)
		{
			String temp=south.getLabel();
			south.setLabel(west.getLabel());
			west.setLabel(temp);
			south1=west1=false;
		}
		
		
		if(west1&&center1)
		{
			String temp=west.getLabel();
			west.setLabel(center.getLabel());
			center.setLabel(temp);
			west1=center1=false;
		}
	}
}

public class Mylayout 
{
	public static void main(String[] arg)
	{
		A obj=new A();
	}
}
