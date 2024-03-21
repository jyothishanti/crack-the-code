import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1=sc.next();
        int n2=n1.length();
        int a=Integer.parseInt(n1);
        int b=(int)Math.pow(a,2);
        int x=b%((int)(Math.pow(10,n2)));
        if(a==x){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        
    }
}
