import java.util.Scanner;
class Max
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c;
System.out.println("enter the first number");
a=sc.nextInt();
System.out.println("enter the second number");
b=sc.nextInt();
System.out.println("enter the third number");
c=sc.nextInt();

if(a>b&&a>c)
{
System.out.println("the maximum number is "+a);
}
else if(b>c)
{
System.out.println("maximum is "+b);
}
else
{
System.out.println("maximum is "+c);
}
}
}

