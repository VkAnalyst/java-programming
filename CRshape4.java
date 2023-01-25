import java.io.*;
import java.util.*;
interface Shape
{
float pi =3.14F;
void disp();
float calc();
}
class Circle implements Shape
{
float r;
Circle(float rad)
{
r=rad;
}
public void disp()
{
System.out.println("This is a circle with radius "+r);
}
public float calc()
{
return(pi*r*r);
}
}
class Rectangle implements Shape
{
float l;
float b;
Rectangle(float len,float bre)
{
l=len;
b=bre;
}
public void disp()
{
System.out.println("This is a rectangle with length "+l+" and breadth "+b);
}
public float calc()
{
return(l*b);
}
}
class CRshape4
{
public static void main(String args[])
{
int s;
boolean x=true;
try
{
Scanner sc=new Scanner(System.in);
while(x)
{
System.out.println("\n1: The area of circle ");
System.out.println("2:  The area of rectangle");
System.out.println("3:  Exit");
System.out.print("Enter your choice:");
s=sc.nextInt();
switch (s)
{
case 1:
System.out.print("Enter the radius of the circle: ");
float r = sc.nextFloat();
Shape s1 = new Circle(r);	
s1.disp();
System.out.println("The area of the circle is: "+s1.calc());
break;
case 2:
System.out.print("Enter the length of the rectangle: ");
float l = sc.nextFloat();
System.out.print("Enter the breadth of the rectangle: ");
float b = sc.nextFloat();
Shape s2 = new Rectangle(l,b);	
s2.disp();
System.out.println("The area of the rectangle is: "+s2.calc());
break;
case 3:
x=false;
break;
default:
System.out.println("Invalid Input");
break;
}
}
}
catch(Exception e)
{
}
}
}
