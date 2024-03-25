
import java.util.*;
public class Main
{
    public static void avg(int a,int b){
      int temp=(a+b)/2;
      System.out.println("the average is:"+temp);
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("enter a:");
	   int a=sc.nextInt();
	   System.out.print("enter b:");
	   int b=sc.nextInt();
	   avg(a,b);
	}
}
