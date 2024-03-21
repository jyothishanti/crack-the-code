import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number:");
		String a=sc.next();
		System.out.print("the number in digits:");
		for(int i=0;i<a.length();i++){
		    System.out.print(a.charAt(i)+" ");
		}
	}
}

