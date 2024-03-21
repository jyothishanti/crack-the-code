import java.util.*;
class method{
    public int multiplication(int a,int b){
       return a*b;
    }
}


public class Main{
    public static void main(String args[]){
       method m=new method();
       Scanner sc=new Scanner(System.in);
       System.out.print("enter the value of a:");
       int a=sc.nextInt();
       System.out.print("enter the value of b:");
       int b=sc.nextInt();
       int x=m.multiplication(a,b);
       System.out.println("the multiplication is:"+x);
    }
}