import java.util.Scanner;
class Series
{
public static void main(String args[])
{
int sum=0;
int temp=0;
int i=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter the limit");
int a=sc.nextInt();
while(i<=a)
{
sum= (sum+i)+temp;
i++;
}
System.out.println("the sum of the series is"+sum);
}
}