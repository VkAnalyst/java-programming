import java.util.Scanner;
class MatrixAdd
{

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the row size");
int r=sc.nextInt();
System.out.println("enter the column size");
int c=sc.nextInt();
int arr[][]=new int[r][c];
int i,j;
System.out.println("enter the array");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
arr[i][j]=sc.nextInt();
}
}
for(i=0;i<r;i++)
{
int sumr=0;
for(j=0;j<c;j++)
{
sumr=sumr+arr[i][j];
}
System.out.println("sum of rows"+sumr);
}
for(i=0;i<c;i++)
{
int sumc=0;
for(j=0;j<r;j++)
{
sumc=sumc+arr[j][i];
}
System.out.println("the column sum is:"+sumc);
}

}
}