import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;

public class Mytree 
{JFrame jf;
JTree jt;
JScrollPane jp;
Mytree()
{
jf =new JFrame("tree demo");
DefaultMutableTreeNode root=new DefaultMutableTreeNode("style");
DefaultMutableTreeNode color=new DefaultMutableTreeNode("color");
DefaultMutableTreeNode font=new DefaultMutableTreeNode("font");
root.add(color);
root.add(font);

DefaultMutableTreeNode red=new DefaultMutableTreeNode("red");
DefaultMutableTreeNode blue=new DefaultMutableTreeNode("blue");
DefaultMutableTreeNode green=new DefaultMutableTreeNode("gree");
color.add(red);
color.add(blue);
//jt.add(root);
//jf.add(jt);

jp=new JScrollPane(jt);
						jt.add(jp);
						jf.setSize(233,233);
						jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						jf.setVisible(true);
}
public static void main(String s[])
					{
						new Mytree();
					}
}
