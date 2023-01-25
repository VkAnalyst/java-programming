import java.util.Scanner;
class Number
{
public static void main(String arg[])

{
string name;
string class;
int age;
Scanner input=new Scanner(System.in);
System.out.println("enter the name");
name=input.next();
System.out.println("enter the class");
class=input.next();
System.out.println("enter age");
age=input.nextInt();
System.out.println("Name:="+name);
System.out.println("Age:="+age);
System.out.println("Class:="+class);
}
}
