import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Swap implements ActionListener
{ JFrame f;
JButton b1;
JButton b2;

    
	 Swap(String s)
	 { f=new JFrame(s);
	   b1=new JButton(new ImageIcon("cross.jpg"));
	   b2=new JButton(new ImageIcon("zero.jpg"));
	   
	   
	   f.add(b1);
	   f.add(b2);
	  f.setLayout(new GridLayout(1,2,20,20));
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(1000,1000);
	   f.setVisible(true);
	   b1.addActionListener(this);
	b2.addActionListener(this);
	   
	   
	 }
	 public void actionPerformed(ActionEvent e)
{

	if(e.getSource()==b1)
b1.setIcon(new ImageIcon("zero.jpg"));


if(e.getSource()==b1)
b2.setIcon(new ImageIcon("cross.jpg"));
	
}

	 public static void main(String p[])
	 {
		 new Swap("x");
		 
	 }
}