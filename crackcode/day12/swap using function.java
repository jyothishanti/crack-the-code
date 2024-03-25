
import java.util.*;
public class Main
{
    public static void fun(int a,int b){
      int temp=a;
      a=b;
      b=temp;
      System.out.println("a="+a+" b="+b);
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("enter a:");
	   int a=sc.nextInt();
	   System.out.print("enter b:");
	   int b=sc.nextInt();
	   fun(a,b);
	}
}
