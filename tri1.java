import java.util.*;
interface area
{
void triarea(float x,float y);
}
class triangle implements area
{
float b,h;
double ar;
public void triarea(float x,float y)
{
b=x;
h=y;
ar=0.5*b*h;
System.out.println("area of the triangle is:"+ar);
}
}
class tr1
{
public static void main(String args[])
{
System.out.println("enter the breadth");
Scanner sc=new Scanner(System.in);
float b=sc.nextFloat();
System.out.println("enter the length");
float l=sc.nextFloat();
area t=new triangle();
t.triarea(b,l);
}
}
