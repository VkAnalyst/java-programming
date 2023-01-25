import java.util.Scanner;

class Even
{
static void number(int n)
{
for(int i=2;i<=n;i++)
{
if((i%2)==0)
{
System.out.println(+i);
}

}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number limit");
int a=sc.nextInt();
System.out.println("--------------------------");
number(a);
}
}