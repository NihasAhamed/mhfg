import java.util.*;
import java.lang.*;
public class sbb
{
public static void main(String aa[])
{
int a;
int b;
Scanner s=new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
a=a^b;
b=a^b;
a=a^b;
System.out.println("%d %d",a,b);
}
}
