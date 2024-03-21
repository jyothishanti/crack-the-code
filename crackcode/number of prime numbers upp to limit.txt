import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter n:");
		int n=sc.nextInt();
		System.out.print("the prime numbers up to "+n+":");
		for( int i=2;i<=n;i++){
		    if(isprime(i)){
		        System.out.print(i+" ");
		    }
		}
	}
	public static boolean isprime(int n){
	    int count=0;
	    for(int i=1;i<=n;i++){
	        if(n%i==0){
	            count++;
	        }
	    }
	    if(count==2){
	        return true;
	    }
	    else{
	        return false;
	    }
	}
}

