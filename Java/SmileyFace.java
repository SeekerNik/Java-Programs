import java.applet.*;
import java.awt.*;

public class SmileyFace extends Applet
{
	public void paint(Graphics g)
	{
		g.drawOval(40,40,250,250);
		g.fillOval(80,80,70,70);
		g.fillOval(180,80,70,70);
		g.drawLine(165,140,165,190);
		g.drawArc(120,170,90,70,0,-180);
	}
}