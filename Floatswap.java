import java.util.Scanner;
class Floatswap
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the first number");
float a=sc.nextFloat();
System.out.println("enter the second number");
float b=sc.nextFloat();
System.out.println("the first number is"+a);
System.out.println(" the second number is"+b);
swap(a,b);
}
static void swap(float a,float b)
{
float temp;
temp=a;
a=b;
b=temp;
System.out.println("after swapping");
System.out.println("the first number is"+a);
System.out.println(" the second number is"+b);
}
}