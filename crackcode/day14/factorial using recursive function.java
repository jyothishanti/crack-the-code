import java.util.*;
public class Main
{
    public static int fact(int n){
       if(n==1 || n==0)
       return 1;
       else 
         return n*fact(n-1);
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("enter n:");
	    int n=sc.nextInt();
	  	int x=fact(n);
	  	System.out.println(x);
	}
}
