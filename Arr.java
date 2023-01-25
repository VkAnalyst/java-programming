import java.util.Scanner;
class Arr{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.print("enter the size of the array");
int n;
int flag=0;
n=sc.nextInt();
int m[]=new int[n];
int i;
System.out.print("enter the array");
for(i=0;i<n;i++)
{
m[i]=sc.nextInt();
}
System.out.print("the array");
for(i=0;i<n;i++)
{
System.out.print(m[i] +"\t");
}
int search;
search=sc.nextInt();
for(i=0;i<n;i++)
{

if(m[i]==search)
{
System.out.print("value found at "+i);
flag++;
}
}
if(flag==0)
{
System.out.print("not found");
}
}
}