import java.util.Scanner;
class Series1
{
static void removal(int num)
{
if(num==0)
{
return;
}
else
{
num=num/10;
removal(num);
System.out.println(num);
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
int num=sc.nextInt();
removal(num);
}
}


