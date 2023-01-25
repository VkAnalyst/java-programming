import java.util.Scanner;
class Palin
{
static void insert()
{
System.out.println("enter the number");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
checkpalin(num);
}
static void checkpalin(int a)
{
int d=0;
int rev=0;
int temp=a;
while(a>0)
{
d=a%10;
rev=(rev*10)+d;
a=a/10;
}
System.out.println("the reverse of the number is"+rev);
if(temp==rev)
{
System.out.println("the number is palindrome");
}
else
{
System.out.println("the number is not a palindrome");
}
}
public static void main(String args[])
{
insert();
}
}

