class Exceptioneg
{
public static void main(String args[])
{
try
{
String s=null;
System.out.println("the length of the string is "+s.length());
}
catch(Exception e)
{
System.out.println("errro occured");
System.out.println(e);
}
}
}
