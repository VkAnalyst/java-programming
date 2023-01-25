
import java.util.Scanner;
class Sum
{
public static void main(String args[])
{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("enter the first number");
a=sc.nextInt();
System.out.println("enter the limit");
b=sc.nextInt();
while(a<=b)
{
System.out.println(a);
a++;
}
}
}
