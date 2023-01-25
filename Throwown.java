class Throwown
{
public static void main(String args[])
{
float x=5;
float y=1000;
try
{
float z=x/y;
if(z<0.1) throw new AnnsException("number too samll");
}
catch(AnnsException e)
{
System.out.println("caugth an exxception");
System.out.println(e);
}
}
}
class AnnsException extends Exception
{
AnnsException(String mess)
{
super(mess);
}
}