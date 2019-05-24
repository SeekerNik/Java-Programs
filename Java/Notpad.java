import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

class nik extends Frame implements ActionListener
{

    TextArea  txt;
	nik()
	{
		setLayout(null);
		setBounds(100,100,400,400);
		
		MenuBar mb=new MenuBar();
		
		Menu file=new Menu("File");
		Menu edit=new Menu("Edit");
		
		MenuItem new1=new MenuItem("new");
		MenuItem save=new MenuItem("save");
		save.addActionListener(this);
		file.add(new1);
		file.add(save);
		
		mb.add(file);
		mb.add(edit);
		
		setMenuBar(mb);
		
		txt=new TextArea();
		txt.setBounds(10,50,10000,1000);
		add(txt);
		
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
		{
			try
			{
			String filename=JOptionPane.showInputDialog("enter filename");
			filename = filename+".txt";
			
			FileOutputStream fout=new FileOutputStream(filename);
			fout.write(txt.getText().getBytes());
			fout.close();
			}catch(Exception ee)
			{
			}
			
		}
	
	
	
	
}

public class Notpad
{
	public static void main(String arg[])
	{
		nik n1=new nik();
	}
}





