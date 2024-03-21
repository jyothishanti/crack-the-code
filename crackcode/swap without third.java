import static java.lang.Math.*;
import java.util.*;
public class Main{
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.print("enter a=");
int a=sc.nextInt();
System.out.print("enter b=");
int b=sc.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println("a="+a+"\n"+"b="+b);
}
}