
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	for(int i=0;i<n;i++){
	    if(i==0 || i==n-1){
	        for(int j=i;j<n-i-1;j++)
	         System.out.print(" ");
	        for(int j=0;j<=i;j++){
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	        else{
	            for(int j=0;j<n-i-1;j++)
	            System.out.print(" ");
	            System.out.print("*");
	            for(int j=0;j<2*i-1;j++)
	            System.out.print(" ");
	            System.out.print("*");
	            System.out.println();
	            
	        }
	    }
	}
}