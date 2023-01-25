import java.util.Scanner;
class Cstr
{
static void length(String s,String m)
{
System.out.println("the length of the first string is "+s.length());
System.out.println("the length of the second string is "+m.length());
}
static void compare(String s,String m)
{
System.out.println("comparing both"+" "+s.equals(m));
}
static void substring(String s,String m)
{
System.out.println("substring of"+s+" "+"is"+" "+s.substring(3));
}
static void lowercase(String s,String m)
{
System.out.println(s.toLowerCase());
System.out.println(m.toLowerCase());
}
public static void main(String args[])
{
String s1,s2;
Scanner sc=new Scanner(System.in);
System.out.println("enter the first string");
s1=sc.next();
System.out.println("enter the next string");
s2=sc.next();
for(;;)
{
System.out.println("1.Length\n2.compare\n3.substring\n4.lowercase\n5.exit\n");
System.out.println("enter your choice");
int ch=sc.nextInt();
switch(ch)
{
case 1:length(s1,s2);
break;
case 2:compare(s1,s2);
break;
case 3:substring(s1,s2);
break;
case 4:lowercase(s1,s2);
break;
case 5:
System.exit(0);
break;


}
}
}

}
