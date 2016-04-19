import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Clayout implements ActionListener
{
JFrame f;
JPanel jp;
JButton b[];
CardLayout cl;

Clayout(String s)
{jp=new JPanel();
cl= new CardLayout();
f=new JFrame(s);
b=new JButton[5];
String s1[]={"NORTH","SOUTH","EAST","WEST","CER"};



for(int i=0;i<b.length;i++)
{
b[i]=new JButton(s1[i]);
b[i].addActionListener(this);
f.add(b[i],"t"+i);
}
f.add(jp);
//f.setLayout(new Layout());
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(1000,1000);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{cl.next(jp);
}

public static void main(String s[])
{new Clayout("bbbll");
}
}
