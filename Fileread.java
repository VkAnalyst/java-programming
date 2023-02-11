import java.io.*;
class Fileread
{
public static void main(String args[])
{
int ch;
char s;
try
{
FileInputStream fin=new FileInputStream("C:\\h.txt.txt");
ch=fin.read();
while(ch!=-1)
{
s=(char)ch;
System.out.print(s);
ch=fin.read();
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}