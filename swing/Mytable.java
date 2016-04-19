import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Mytable extends JFrame
{
	String heading[]={"name","add","sal"};
	String items[][]={
		{"amit","delhi","233333"},
		{"amit2","delhi1","233333"},
		{"amit3","delhi1","233333"},
		
		
					};
					public Mytable()
					{
						super("table");
						JTable jt=new JTable(items,heading);
						JScrollPane js=new JScrollPane(jt);
						add(js);
						setSize(233,233);
						setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						setVisible(true);
						
					}
					public static void main(String s[])
					{
						new Mytable();
					}
}

