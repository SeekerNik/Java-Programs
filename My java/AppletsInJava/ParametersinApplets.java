package AppletsInJava;

import java.applet.Applet;
import java.awt.Graphics;
/*<applet code="MyApplet.class" width="200" height="220" ><param name="name1" value="NIkhil"/></applet> */
public class ParametersinApplets extends Applet 
{
	public String para="hello";

	public void paint(Graphics g)
	{
		String s=getParameter("name1");
		if(s==null)
		{
			s=para;
		}
		g.drawString(s, 10, 20);
	}
}
