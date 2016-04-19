import java.awt.*;
import javax.swing.*;
class Calc
{Calc()
{int x=10;int y=100;
String s[]={"MC","MR","MS","M+","M-","->","CE","C","+-","RT","7","8","9","/","%","4","5","6","*","nk","1","2","3","-","=","0","00",".","+","="};
JFrame f1=new JFrame("Ananya");
f1.setLayout(null);
TextField tf=new TextField();
tf.setBounds(10,10,250,50);
f1.add(tf);
Button b1[]=new Button[30];
for(int i=0;i<s.length;i++)
{
	b1[i]=new Button(s[i]);
 	b1[i].setBounds(x,y,40,40);
	f1.add(b1[i]);
      if(x<=180)
      {x+=45;}
      else
      {x=10;
      y+=40;}
}
f1.setSize(1000,1000);
f1.setVisible(true);
f1.pack(); //not a method of frame ..
}
public static void main(String...s)
{new Calc();}
}