import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class JLabel extends JFrame
{
public static void main(String[] arg)
{ new JLabel();
}

	public JLabel()
	{
	super("using html in java");
	WindowUtilities.setNativeLookAndFeel();
	addWindowListener(new exitListener());
	Container content=getContentPane();
	Font font=new Font("Serif",Font.PLAIN,30);
	content.setFont(font);

String labeltext="<html><FONT COLOR=RED>RED</FONT>and" +
                            "<FONT COLOR=BLUE>BLUE</FONT>Text</html>" ;
JLabel coloredlabel=new JLabel(labeltext,JLabel.CENTER);

Border b=BorderFactory.createTitledBorder("Mixed color");

coloredlabel.setBorder(b);
content.add(coloredlabel,BorderLayout.NORTH);
labeltext=
"<html><B>Bold</B>and<i>Italic</I>Text</html>";

JLabel boldlabel=new JLabel(labeltext,JLabel.CENTER);
boldlabel.setBorder(BorderFactory.createTitledBorder("mixed color"));
content.add(boldlabel,BorderLayout.CENTER);

labeltext="<html>INDIA IS A GOOD COUNTRY"+
	"in the world"+
	"<p>"+
	"major cities"+
	"<UL>"+
	"<LI>delhi"+

	"<LI>goa"+
	"<LI>pune"+
	"<LI>mumbai";

JLabel fancylabel=new JLabel(labeltext,JLabel.CENTER);
fancylabel.setBorder(BorderFactory.createTitledBorder("multi line html"));
content.add(boldlabel,BorderLayout.SOUTH);

pack();
setVisible(true);
}
}


