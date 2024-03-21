import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int count=0,n;
		if(n1<n2){
		    n=n1;
		}
		else{
		    n=n2;
		}
		int gcd=0;
	    for(int i=1;i<=n;i++){
	        if(n1%i==0  && n2%i==0){
	             gcd=i;
	        }
	    }
	    System.out.println(gcd);
	}
	
}

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int count=0,n;
		if(n1<n2){
		    n=n1;
		}
		else{
		    n=n2;
		}
		int gcd=0;
	    for(int i=n;i>=1;i--){
	        if(n1%i==0  && n2%i==0){
	             gcd=i;
	             break;
	        }
	    }
	    System.out.println(gcd);
	}
	
}




import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int x;
	  x=gcd(n1,n2);
	  System.out.println(x);
	}
	public static int gcd(int n1,int n2){
	    while(n1>0 && n2>0){
	    if(n1>n2){
	       n1=n1%n2;
	    }
	    else{
	        n2=n2%n1;
	    }
	   }
	    if(n1==0){
	        return n2;
	    }
	    else{
	        return n1;
	    }
	      
	}
	
}



