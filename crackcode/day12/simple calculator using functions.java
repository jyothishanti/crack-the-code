
import java.util.*;
public class Main
{
    public static void add(int a,int b){
        System.out.println(a+b);
    }
     public static void sub(int a,int b){
        System.out.println(a-b);
    }
     public static void div(double a,double b){
        System.out.println(a/b);
    }
     public static void fact(int a){
         int f=1;
       for(int i=1;i<=a;i++){
            f=f*i;
       }
       System.out.println(f);
    }
     public static void squareroot(int a){
        System.out.println(a*a);
    }
     public static void mul(int a,int b){
        System.out.println(a*b);
    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
		    System.out.print("1.addition\n2.subtraction\n3.division\n4.factorial\n5.squareroot\n6.multiplication\n7.exit\n");
		    System.out.print("enter your choice:");
		    int ch=sc.nextInt();
		   int a,b;
		    switch(ch){
		        case 1: System.out.print("enter a:");
		                a=sc.nextInt();
		                System.out.print("enter b:");
		                b=sc.nextInt();
		                add(a,b);
		                break;
		        case 2:System.out.print("enter a:"); 
		               a=sc.nextInt();
		               System.out.print("enter b:");
		               b=sc.nextInt();
		               sub(a,b);
		               break;
		       case 3: System.out.print("enter a:");
		               double c=sc.nextDouble();
		               System.out.print("enter b:");
		               double d=sc.nextDouble();
		               div(c,d);
		               break;
		       case 4:System.out.print("enter a:");
		              a=sc.nextInt();
		              fact(a);
		              break;
		       case 5: System.out.print("enter a:");
		               a=sc.nextInt();
		               squareroot(a);
		               break;
		       case 6: System.out.print("enter a:");
		               a=sc.nextInt();
		               System.out.print("enter b:");
		               b=sc.nextInt();
		               mul(a,b);
		               break;
		      case 7:System.exit(0);
		       
		    }
		}
	}
}
