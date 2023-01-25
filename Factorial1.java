import java.util.Scanner;
class Factorial1
{
static int numfact(int n)
{
if(n==0)
{
return 1;
}
else
{
return(n*numfact(n-1));
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int fact=1;
System.out.println("enter the number ");
int n=sc.nextInt();
fact=numfact(n);
System.out.println("the factorial of the number is"+fact);
}
}