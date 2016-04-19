import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Glayout
{
JFrame f;
JButton b[];

Glayout(String s)
{
//TextField tf =new TextField();
f.add(tf);
f=new JFrame(s);
b=new JButton[30];
String s1[]={"MC","MR","MS","M+","M-","->","CE","C","+-","RT","7","8","9","/","%","4","5","6","*","nk","1","2","3","-","=","0","00",".","+","="};



for(int i=0;i<b.length;i++)
{
b[i]=new JButton(s1[i]);
f.add(b[i]);
}
f.setLayout(new GridLayout(8,4,40,20));
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(1000,1000);
f.setVisible(true);
}

public static void main(String s[])
{new Glayout("bbbll");
}
}
