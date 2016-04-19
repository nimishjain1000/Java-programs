import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Glayout1
{
JFrame f;
JPanel jp=new JPanel();
JPanel jp1=new JPanel();

JButton b[];

Glayout1(String s)
{
TextField tf =new TextField();
//tf.setBounds(10,20,50,50);

jp.add(tf);
jp.setLayout(  BoarderLayout(5,6,40,20));

f=new JFrame(s);
b=new JButton[30];
String s1[]={"MC","MR","MS","M+","M-","->","CE","C","+-","RT","7","8","9","/","%","4","5","6","*","nk","1","2","3","-","=","0","00",".","+","="};



for(int i=0;i<b.length;i++)
{
b[i]=new JButton(s1[i]);
jp1.add(b[i]);
}
jp1.setLayout(new GridLayout(5,6,40,20));
f.add(jp);
f.add(jp1);
f.setLayout(new GridLayout(2,1));
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(1000,1000);
f.setVisible(true);
}

public static void main(String s[])
{new Glayout1("bbbll");
}
}
