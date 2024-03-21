
import java.util.*;
public class Main
{
    public  static int square(int x){
        return (x*x);
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("enter the number:");
	    int x=sc.nextInt();
		int n=square(x);
		System.out.println("the square of the number is:"+n);
	}
}
