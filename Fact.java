import java.util.Scanner;
class Fact
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the limit");
double n=sc.nextDouble();
double f=1;
int i;
double sum=0;
for(i=1;i<=n;i++)
{
f=f*i;
sum=sum+(i/f);
}
System.out.println("the sum is"+sum);
}
}
