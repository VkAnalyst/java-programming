
import java.io.*;
import java.util.*;
interface shape{
public void area(int x,int y);
}
class triangle implements shape
{
public void area(int b,int h){
double area=0.5*b*h;
System.out.println("Area of triangle: "+area);
}
}
class RTPA3
{
public static void main(String args[])throws Exception
{
Scanner s=new Scanner(System.in);
System.out.print("Enter the breadth of the triangle: ");
int b=s.nextInt();
System.out.print("Enter the height of the triangle: ");
int h=s.nextInt();
triangle tri = new triangle();
tri.area(b,h);
}
}
