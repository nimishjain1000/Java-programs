import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class  Mymenu   
{
	JTextField tf= new JTextField();
	JFrame jf=new JFrame("Mymenu");

	JMenuBar menubar;
	JMenu menu,submenu;
	JMenuItem menuitem;

	JRadioButtonMenuItem rbmenuitem;
	JCheckBoxMenuItem cbmenuitem;


Mymenu()
{
jf.add(tf);
menubar=new JMenuBar(); 
menu=new JMenu("First MEnu");
menu.setMnemonic(KeyEvent.VK_F);
menubar.add(menu);

menuitem=new JMenuItem("A text-only menu item",KeyEvent.VK_T);
//menuitem.addActionListener(this);
Icon i1=new ImageIcon("images/new...");
menuitem.setIcon(i1);
KeyStroke i=KeyStroke.getKeyStroke(KeyEvent.VK_1,ActionEvent.CTRL_MASK);
menuitem.setAccelerator(i);
menu.add(menuitem);

menu.addSeparator();

ButtonGroup group=new ButtonGroup();
rbmenuitem=new JRadioButtonMenuItem("A radio button");
rbmenuitem.setSelected(true);
rbmenuitem.setMnemonic(KeyEvent.VK_O);
group.add(rbmenuitem);
menu.add(rbmenuitem);
rbmenuitem=new JRadioButtonMenuItem("Another button");
rbmenuitem.setSelected(true);
rbmenuitem.setMnemonic(KeyEvent.VK_P);
group.add(rbmenuitem);
menu.add(rbmenuitem);
menu.addSeparator();

// group of check box

/* cbmenuitem=new CheckBoxMenuItem("a check box");
cbmenuitem.setMnemonic(KeyEvent.VK_C);
menu.add(cbmenuitem);*/


//a submenu

menu.addSeparator();
submenu=new JMenu("a submenu");
submenu.setMnemonic(KeyEvent.VK_S);
menuitem=new JMenuItem("an item  in the submenu");
submenu.add(menuitem);


jf.add(menubar);
jf.setSize(300,400);
jf.setVisible(true);
}

public static void main(String k[])
{
new Mymenu();
}

}




