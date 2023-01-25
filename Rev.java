import java.util.Scanner;
class Rev
{
static void strrev(String s)
{
char ch;
String nstr="";
for(int i=0;i<s.length();i++)
{
ch= s.charAt(i); //extracts each character
nstr= ch+nstr; //adds each character in front of the existing string
}
System.out.println("Reversed word: "+ nstr);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the string to reverse");
String s=sc.next();
strrev(s);
}
}
