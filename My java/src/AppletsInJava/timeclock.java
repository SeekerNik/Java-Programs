package AppletsInJava;
import java.applet.*;
import java.awt.Graphics;
import java.awt.Paint;
import java.util.*;

public class timeclock extends Applet implements Runnable 
{
	Thread t1,t2;
	public void start()
	{
		t1=new Thread(new timeclock());
		t1.start();
	}
	
	public void run()
	{
		t2=Thread.currentThread();
		while(t2==t1)
		{
			repaint();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				
			}
		}
	}
	
	public void paint(Graphics g)
	{
		Calendar c1=new GregorianCalendar();
		int hour=c1.get(Calendar.HOUR);
		int min=c1.get(Calendar.MINUTE);
		int sec=c1.get(Calendar.SECOND);
		int milsec=c1.get(Calendar.MILLISECOND);
		g.drawString("Time :"+hour+":"+min+":"+sec+":"+milsec,200,300);
		
		
	}
}

