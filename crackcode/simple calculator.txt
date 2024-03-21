import static java.lang.Math.*;
import java.util.*;
public class Main{
public static void main(String args[]){
while(true){
    Scanner sc =new Scanner(System.in);
    System.out.println("enter two numbers");
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("enter operation");
    String ch1=sc.next();
    char ch=ch1.charAt(0);
    
    switch(ch){
        case '+':System.out.println("the sum is: "+ (a+b));
                 break;
        case '-':System.out.println("the sub is: "+(a-b));
        break;
        case '*':System.out.println("the mul is: "+(a*b));
        break;
        case '/':System.out.println("the div is: "+(a/b));
        break;
        case '%':System.out.println("the div is: "+(a%b));
        break;
        default:System.out.println("please select from + or - or * or / or %");
        System.exit(0);
    }
}
}
}