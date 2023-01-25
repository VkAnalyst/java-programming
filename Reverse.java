import java.util.Scanner;

class Reverse
{
static void number(int n)
{
while(n>0)
{
int d=0;
int r=0;
d=n%10;
r=(r*10)+d;
n=n/10;
}
System.out.println("the revrse of the numerb is"+r);
}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number to find reverse");
int a=sc.nextInt();
System.out.println("--------------------------");
number(a);
}
}