class Number{
public static void main(String args[])
{
float n=Float.parsefloat(args[0]);
int i;
float p=1;
for(i=1;i<=n;i++)
{
float num=Float.parseFloat(args[0]);
p=p *num;
}
System.out.print("product is " +p);
}
}