import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number:");
        int n=sc.nextInt();
        if(n%2==0)
        System.out.print(n+" is even number");
        else
         System.out.print(n+" is odd number");
    }
}