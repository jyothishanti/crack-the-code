import static java.lang.Math.*;
import java.util.*;
public class Main{
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.print("enter string:");
String a=sc.nextLine();
String b="";
for(int i=a.length()-1;i>=0;i--){
    b+=a.charAt(i);
}
System.out.println("the reversed string is :"+b);
}
}