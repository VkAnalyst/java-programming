
import java.util.Scanner;
class Swap
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the first number");
int a=sc.nextInt();
System.out.println("enter the second number");
int b=sc.nextInt();
int temp;
temp=a;
a=b;
b=temp;
System.out.println("a="+a);
System.out.println("b="+b);
}
}
