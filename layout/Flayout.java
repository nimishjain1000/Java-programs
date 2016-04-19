import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Flayout
{
JFrame f;
JButton b[];

Flayout(String s)
{
f=new JFrame(s);
b=new JButton[5];
String s1[]={"NORTH","SOUTH","EAST","WEST","CER"};



for(int i=0;i<b.length;i++)
{
b[i]=new JButton(s1[i]);
f.add(b[i]);
}
f.setLayout(new FlowLayout(FlowLayout.CENTER,300,30));
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(1000,1000);
f.setVisible(true);
}

public static void main(String s[])
{new Flayout("bbbll");
}
}
