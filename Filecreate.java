import java.io.*;
public class Filecreate
{
public static void main(String args[])
{
try
{
FileOutputStream fout=new FileOutputStream("C:\\vyshakh.txt");
System.out.println("file created");
fout.close();
}
catch (Exception e)
{
System.out.println("Error"+e);
}
}
}