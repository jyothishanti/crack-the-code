import static java.lang.Math.*;
import java.util.*;
public class Main{
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.print("enter number:");
int n=sc.nextInt();
int num=n;
int sum=0;
while(n>0){
    int digit=n%10;
  
     sum=sum*10+digit;
    n=n/10;
}
System.out.println("the reversed number is: "+sum);
}
}