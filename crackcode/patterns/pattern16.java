
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	for(int i=n;i>0;i--){
	    if(i==1 || i==n){
	        for(int j=n-i+1;j>i;j--)
	         System.out.print(" ");
	        for(int j=0;j<i;j++){
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	        else{
	            for(int j=0;j<n-i;j++)
	            System.out.print(" ");
	            System.out.print("*");
	            for(int j=0;j<2*(i-1)-1;j++)
	            System.out.print(" ");
	            System.out.print("*");
	            System.out.println();
	            
	        }
	    }
	}
}
