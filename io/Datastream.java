import java.io.*;
class Datastream    //problem with data stream files is that the file created is not supported by                             //notepad as file written in u
{
public static void main(String... a)throws IOException
{
FileOutputStream fout =new FileOutputStream("toi.txt");
DataOutputStream dout =new DataOutputStream(fout);
dout.writeInt(100);
dout.writeLong(100000);
dout.writeBoolean(true);
dout.writeDouble(100.00);
dout.close();

fout.close();
FileInputStream fin =new FileInputStream("toi.txt");
DataInputStream din =new DataInputStream(fin);

int i=din.readInt();
long l=din.readLong();//this should be written in the same order as that written in file
boolean b=din.readBoolean();
double d=din.readDouble();
System.err.println(i);
System.err.println(l);
System.err.println(b);
System.err.println(d);
fin.close();
din.close();
}
}
