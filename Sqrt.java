import java.util.*;
class Sample
{
public double a;
public Sample(double a)
{
this.a=a;
}
}
class Sqrt
{
public static void main(String args[])
{
System.out.println("enter a number");
Scanner sc=new Scanner(System.in);
double n=sc.nextDouble();
Sample s=new Sample(n);
findsqrt(s);
}
public static void findsqrt(Sample s)
{
System.out.println("the square root is"+Math.sqrt(s.a));
}
}