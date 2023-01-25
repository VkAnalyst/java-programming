import java.util.Scanner;
class Mton
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the Starting point");
int a=sc.nextInt();
System.out.println("enter the limit");
int n=sc.nextInt();
System.out.println("--------------------");
while(a<=n)
{
System.out.println(a);
a++;
}
}
}