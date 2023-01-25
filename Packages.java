import java.util.*;
import java.lang.*;
import prime_factor.*;
class Packages
{
public static void main(String args[])
{
try
{ 
int num=1,temp;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
num=sc.nextInt();
temp=num;
prime x=new prime();
x.disp(temp);
}
catch(Exception e)
{
System.out.println("error"+e);
}
}
}
//package making
package prime_factor;
import java.io.*;
public class prime1
{
public void disp(int temp)
{
int i=2;
System.out.println("Factors are ");
while((temp!=0)||(i<=0))
{
if((temp==0)||(i<=0))
{
break;
}
else
{
if(temp%i==0)
{
System.out.println(i);
temp=temp/i;
}
else
{
i=i+1;
}
}
}
}
}
