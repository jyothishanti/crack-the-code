import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
	    for(int i=1;i<=Math.sqrt(n);i++){
	        if(n%i==0){
	          count++;
	          if((n/i)!=i){
	              count++;
	          }
	    }
	    }
	    if(count==2){
	        System.out.println("It is a prime");
	    }
	    else{
	        System.out.println("It is not a prime");
	    }
	}
	
}



or




import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++){
		        if(n%i==0){
		            count++;
		        }
		    }
		if(count==2){
		       System.out.println("yes");
		}
		else{
		     System.out.println("no");
		}
		
	}
}

