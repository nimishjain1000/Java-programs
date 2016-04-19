import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Jcolorchooser extends JFrame implements ActionListener
{   public Jcolorchooser()
   {
     super("using jcolor chooser");
	 //WindowUtilities.setNativeLookAndFeel();
	 //addWindowListener(new ExitListener());
	 Container content=getContentPane();
	 content.setBackground(Color.white);
	 content.setLayout(new FlowLayout());
	 
	 JButton colorbutton=new JButton("choose color");
	 colorbutton.addActionListener(this);
	 content.add(colorbutton);
	 setVisible(true);
	 
   }
   public static void main(String s[])
   {
	   new Jcolorchooser();
   }

   public void actionPerformed(ActionEvent e)
   {
	   Color bgcolor=JColorChooser.showDialog(this,"Choose bg color",Color.RED);
	   if(bgcolor!=null)
	   {
		   getContentPane().setBackground(bgcolor);
	   }
   }
}
