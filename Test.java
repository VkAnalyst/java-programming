import java.util.Scanner;
class Test
{
Test(int r)
{
int square=r*r;
}
void area()
{
float pi=3.14f;
float ar=square*pi;
System.out.println("the area of the circle with radius"+r+" is"+ar);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int r=sc.nextInt();
Test t=new Test(r);
}
}