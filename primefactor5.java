//package
package package1;
public class pfactor
{
static boolean prime(int n) 
{ 
boolean flag = false;
for(int i = 2;i<=n/2;i++)
{
if(n%i==0)
{
flag = true;
break;
}
}
return flag;
} 
public void find(int a) 
{ 	
System.out.print("Prime Factors : ");
for(int i = 2;i<=a;i++)
{
if(a%i==0 && !prime(i))
{
System.out.print(i + "\t");
}
}
} 
}
//mainclass
import package1.*;
import java.util.*;
class primefactor5
{
public static void main(String args[])
{
pfactor p = new pfactor();
Scanner din =  new Scanner(System.in);
System.out.println("Enter a number : ");
int n = din.nextInt();
p.find(n);
}
}

