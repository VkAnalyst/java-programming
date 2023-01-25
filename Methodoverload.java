
import java.util.Scanner;
class Maximum
{
static int max(int a,int b,int c)
{
if(a>b&&a>c)
{
return a;
}
else if(b>c)
{
return b;
}
else
{
return c;
}
}
static float max(float a,float b,float c)
{
if(a>b&&a>c)
{
return a;
}
else if(b>c)
{
return b;
}
else
{
return c;
}
}
class Methodoverload
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the first numbr");
int a=sc.nextInt();
System.out.println("enter the 2nd numbr");
int b=sc.nextInt();
System.out.println("enter the 3rd numbr");
int c=sc.nextInt();
System.out.println("the maximum is"+Maximum.max(a,b,c));

System.out.println("enter the first numbr");
float m=sc.nextFloat();
System.out.println("enter the 2nd numbr");
float n=sc.nextFloat();
System.out.println("enter the 3rd numbr");
float o=sc.nextFloat();
System.out.println("the maximum is"+Maximum.max(m,n,o));
}
}
}

