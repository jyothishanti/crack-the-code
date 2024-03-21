import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a:");
        int a=sc.nextInt();
        System.out.print("enter b:");
        int b=sc.nextInt();
        System.out.print("enter c:");
        int c=sc.nextInt();
        if(a>b&&a>c)
            System.out.println("the largest number is:"+a);
        else if(b>c)
            System.out.println("the largest number is:"+b);
        else
            System.out.println("the largest number is:"+c);
        
    }
}