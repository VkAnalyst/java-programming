class New{
public static void main(String args[])
{
int a;
int i;
int p=1;
int size=Integer.parseInt(args[0]);
for(i=0;i<size;i++)
{
Integer.parseInt(args[i]);
p=p*size;
}
System.out.print("product is "+p);
}
}