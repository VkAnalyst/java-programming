import java.util.Scanner;
class Digit
{
static int digitsum(int num)
{
int temp;
int d;
int sum=0;
while(num>0)
{
d=num%10;
sum=sum+d;
num=num/10;
}
return sum;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int a=sc.nextInt();
System.out.println("the sum of the digits is"+"  "+digitsum(a));
}
}



