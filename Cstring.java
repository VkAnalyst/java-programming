import java.util.Scanner;
class Cstring
{
static void read()
{
Scanner sc=new Scanner(System.in);
String s,m;
System.out.println("enter the string");
s=sc.next();
System.out.println("enter the next string");
m=sc.next();
display(s,m);
compare(s,m);
add(s,m);
concat(s,m);
}
static void display(String s,String m)
{
System.out.println("Entered string is"+s);
System.out.println("Entered string is"+m);
}
static void compare(String s,String m)
{
System.out.println("comparing strings :"+" "+s==m);
}
static void add(String s,String m)
{
System.out.println("adding strings :"+" "+s+m);
}
static void concat(String s,String m)
{
System.out.println("concatenating strings :"+" "+s.concat(m));
}
public static void main(String args[])
{
read();
}
}