import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class  Sframe implements ActionListener
{	JFrame f;
	JButton b;
	JTextField jt;
	Button b1;
	Sframe(String s)
{
	
	f=new JFrame(s);
	jt=new JTextField();
	jt.setBounds(150,50,100,100);
	b=new JButton("Swing");
	b1=new Button("awt");
	b.setBounds(40,40,40,40);
	b1.setBounds(40,140,50,50);
	f.add(b);
	b.addActionListener(this);
	f.add(b1);
	f.add(jt);
	f.setLayout(null);
	f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	f.setSize(400,400);
	f.setVisible(true);

}
	public void actionPerformed(ActionEvent e)
{	jt.setText("Swing");
	}
	public static void main(String s[])
	{new Sframe("SwingFrame:");
}
}
