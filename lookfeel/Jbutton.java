import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JButton extends JFrame
{
 	public static void main(String s[])
	{new JButton("using jbutton");
	}
 
JButton(String a)
{
super(a);
WindowUtilities.setMotifLookAndFeel();

addWindowListener(new ExitListener());
Container content=getContentPane();
JButton but1=new Jbutton("first");
content.add(but1);
JButton but2=new JButton("two");
content.add(but2);
JButton but3=new JButton("third");
content.add(but3);
JButton but4=new JButton("fourth");
content.add(but4);
pack();
setVisible(true);
}
}

