import java.awt.*;
import java.awt.event.*;
class MyBestie implements ActionListener
{
Frame f;
Button b,b1;
TextField tf;
	MyBestie(String s)
	{
	f=new Frame(s);
	b=new Button("BSH");
	b1=new Button("<3");
	b.setBounds(20,100,80,80);
	b1.setBounds(20,280,80,80);
	
	b.addActionListener(this);
	b1.addActionListener(this);
	
	f.add(b);
	f.add(b1);
	tf=new TextField();
	tf.setBounds(20,40,200,50);
	f.add(tf);
	f.setLayout(null);
	f.setSize(400,400);

	
f.setVisible(true);


	}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b)
tf.setText("UD is my bestie"); 

if(e.getSource()==b1)
tf.setText("UD also love NIMISH");
}

public static void main(String A[])
{new MyBestie("motee love dabbu");
}
}
