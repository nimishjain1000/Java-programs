import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.text.*;


class Clock implements Runnable
{
JFrame jf;
String timestring="";
Thread t;
int hrs=0;
int min=0;
int sec=0;
JButton b;

	Clock()
	{
	jf=new JFrame("clock");
	t=new Thread(this);
	t.start();
	b=new JButton();
	b.setBounds(200,200,50,100);
	jf.add(b);
	jf.setSize(500,500);
	jf.setVisible(true);
	jf.setLayout(null);
	}

public void run()
{try{
while(true)
{ Calendar cal= Calendar.getInstance();

hrs=cal.get(Calendar.HOUR_OF_DAY);
if(hrs>12)
hrs=hrs-12;
min=cal.get(Calendar.MINUTE);
sec=cal.get(Calendar.SECOND);
SimpleDateFormat formatter= new SimpleDateFormat("hh:mm:ss");
Date date=cal.getTime();
timestring=formatter.format(date);
printTime();
Thread.sleep(1000);
}
}
catch(Exception e)
{
System.out.println(e);
}

}
void printTime()
{
b.setText(timestring);
}
public static void main(String... s)
{new Clock();
}
}


	