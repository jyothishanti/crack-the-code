import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number:");
        int n=sc.nextInt();
        if((n%10)%2==0){
            System.out.println("the last digit number is even number");
        }
        else{
            System.out.println("the last digit number is not even number");
        }
    }
}