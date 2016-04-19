import java.awt.*;

class Myframe1 
{
Frame f;
TextField tf;
Button b1;
Myframe1(String s)
{
f=new Frame(s);
tf=new TextField();
tf.setBounds(40,40,60,30);
f.add(tf);
b1=new Button("  okkk");
b1.setBounds(40,100,40,40);
f.add(b1);
f.setLayout(null);
f.setSize(400,400);
f.setVisible(true);
}
 
public static void main(String...s)
{
new Myframe1("Nimish");
}
}
