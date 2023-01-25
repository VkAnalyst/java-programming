import java.util.Scanner;
class Small
{
public static void main(String arg[])
{
int a;
int b;
int c;
int smallest;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
smallest=c<(a<b?a:b)?c:(a<b?a:b);
System.out.print("small value is"+smallest);
}
}


