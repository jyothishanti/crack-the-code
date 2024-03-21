import static java.lang.Math.*;
import java.util.*;
public class Main{
    public static int fibo(int n){
        if(n==0)
          return 0;
        else if(n==1 || n==2)
        return 1;
        else
         return fibo(n-1)+fibo(n-2);
    }
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.print("enter nth fibonacci number:");
int n=sc.nextInt();
System.out.println("the "+n+" element in fibonacci series:"+fibo(n));
}
}