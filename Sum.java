import java.awt.*;
import java.awt.event.*;
class Sum implements ActionListener

{
Frame f;
Button b;
TextField tf,tf1,tf2;

Sum()
{
f=new Frame("A");
b= new Button("sum");
b.addActionListener(this);

tf=new TextField();
tf1=new TextField();
tf2=new TextField();

f.add(tf);
f.add(tf1);
f.add(tf2);
f.add(b);
f.setBackground(Color.RED);
f.setLayout(new FlowLayout());
f.setSize(400,400);
f.setVisible(true);

}

public void actionPerformed(ActionEvent e)
{

String s1=tf.getText();
String s2=tf1.getText();
String s3=tf2.getText();

int n1=Integer.valueOf(s1);
int n2=Integer.valueOf(s2);
int n3=n1*n2;

tf2.setText(String.valueOf(n3));
}

public static void main(String s[])
{new Sum();
}
}

