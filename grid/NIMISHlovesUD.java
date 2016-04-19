//import java.awt.*;
import javax.swing.*;
//import java.awt.event.*;

class NIMISHlovesUD extends JFrame
{
JButton b1,b2,b3,b4,b5;
	public NIMISHlovesUD()
	{
		b1=new JButton("NLU1");
		b2=new JButton("NLU2");
		b3=new JButton("NLU3");
		b4=new JButton("NLU4");
		b5=new JButton("NLU5");

	add(b1);
	add(b2);
	add(b3);
	add(b4);
	add(b5);
		setLayout(new GridLayout(3,2));
		setVisible(true);
		setSize(100,100);
}
public static void main(String args[])
{
	new NIMISHlovesUD();
}
}

