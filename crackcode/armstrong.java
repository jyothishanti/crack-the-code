
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int sum=0;
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		int b=Integer.parseInt(a);
		int n=a.length();
		
		int num=b;
		while(b>0){
		    int digit=b%10;
		    int x=(int) (Math.pow(digit,n));
		    sum=sum+(x);
		    b=b/10;
		}
		if(sum==num){
		    System.out.println("yes");
		}
		else{
		    System.out.println("no");
		}
		
	}
}

