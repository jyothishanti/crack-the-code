
import java.util.*;
public class Main
{
    public static int fun(int a,int b){
       if(a==b)
        return 0;
       else if(a>b)
       return 1;
       else
       return -1;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("enter a:");
	   int a=sc.nextInt();
	   System.out.print("enter b:");
	   int b=sc.nextInt();
	   int x=fun(a,b);
	   if(x==0)
	   System.out.println("equal");
	   else if(x==1)
	    System.out.println("a is greater than b");
	   else
	    System.out.println("a is less than b");
		
	}
}
