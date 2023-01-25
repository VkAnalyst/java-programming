import java.util.Scanner;
class Matrix
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the row size");
int r=sc.nextInt();
System.out.println("enter the coloumn size");
int c=sc.nextInt();
int i,j;
int a[][]=new int[r][c];
System.out.println("enter the array");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("entered array is"+ a.length +a[0].length);
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.println(a[i][j]    +"\t");
}
}

