import static java.lang.Math.*;
import java.util.*;
public class Main{
    public static void fibo(int n){
       int prev=0;
       int current=1;
       System.out.print(prev);
       while(current<=n){
           System.out.print(" "+current);
           int next=prev+current;
           prev=current;
           current=next;
       }
    }
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.print("enter upper limit fibonacci number:");
int n=sc.nextInt();
fibo(n);

}
}