import java.applet.*;
import java.awt.*;
/* four main method of applet are 
1-init():
2-start():
3-stop():
4-destroy():
*/
public class AppJava extends Applet 
{
	/*public void init()
	{
		//initialization
	}
	
	public void start()
	{
		//start or resume the execution 
	}
	
	public void stop()
	{
		//suspend execution
	}
	
	public void destroy()
	{
		//perform shoutdown activity 
	}
	
	public void paint(Graphics g)
	{
		//display the content of window 
	}*/
	
	public void paint(Graphics g)
	{
		g.drawString("What can i do for you",100,100);
	}
}





