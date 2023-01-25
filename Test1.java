import java.util.Scanner;
class Test1
{
int square;
Test1(int n)
{
square=n*n;
}
void area()
{
float pi=3.14f;
float ar=square*pi;
System.out.println("the area of the circle is"+ar);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int r=sc.nextInt();
Test t=new Test(r);
}
}