import java.util.Scanner;
class Even1
{
static void sumeven(int n)
{
int i;
int sum=0;
for(i=2;i<=n;i++)
{
if((i%2)==0)
{
sum=sum+i;
}
}
System.out.println("sum of the series is"+sum);
}
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
System.out.println("enter the limit");
int a=sc.nextInt();
sumeven(a);
}
}
