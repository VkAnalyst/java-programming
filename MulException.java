import java.io.*;
import java.lang.*;
import java.util.*;
class MulException
{
public static void main(String args[])
{
try
{
int i=0;
String s;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of elements to be inserted");
s=sc.next();
int n=Integer.parseInt(s);
int a[]=new int[3];
while(i<n)
{
System.out.println("enter the elements");
s=sc.next();
a[i]=Integer.parseInt(s);
i++;
}
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);
}
catch(Exception e)
{

System.out.println(e);
}
}
}
