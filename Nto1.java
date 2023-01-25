import java.util.Scanner;
class Nto1
{
static void printnum(int n)
{
if(n<=0)
{
return;
}
else
{

System.out.println(n);
printnum(n-1);
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the limit");
int num=sc.nextInt();
printnum(num);
}
}