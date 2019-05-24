package SwingsInJava;

import javax.swing.*;

public class JFrameInjava extends JFrame{
	JFrameInjava(){
		
	}
	
	JFrameInjava(String s){
		super(s);
	}

	public static void main(String[] args)
	{
		JFrameInjava js=new JFrameInjava("Swings In Java");
		js.setSize(200, 200);
		js.setVisible(true);
		
		
	}

}
