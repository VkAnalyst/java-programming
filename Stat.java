import java.util.Scanner;
class Stat
{
public static void main(String arg[])
{
int num1;
int num2;
int num3;
Scanner sc=new Scanner(System.in);
num1=sc.nextInt();
num2=sc.nextInt();
num3=sc.nextInt();
if((num1>num2)&&(num1>num3))
{
System.out.print("max is" +num1);
}
else if(num2>num3)
{
System.out.print("max is "+num2);
}
else
{
System.out.print("max is "+num3);
}
}
}













