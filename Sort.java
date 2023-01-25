import java.util.Scanner;
class Sort{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.print("enter the size of the array");
int n;
n=sc.nextInt();
int m[]=new int[n];
int temp;
int i;
System.out.print("enter the array");
for(i=0;i<n;i++)
{
m[i]=sc.nextInt();
}
System.out.print("the array before sorting");
for(i=0;i<n;i++)
{
System.out.print(m[i] +"\t");
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(m[i]>m[j])
{
temp=m[i];
m[i]=m[j];
m[j]=temp;
}
}
System.out.print("the array after sorting");
for(i=0;i<n;i++)
{
System.out.print(m[i] +"\t");
}
}
}
}


