import java.util.*;
public class Main{
public static void main(String args[]){
while(true){
    System.out.println("1. c to f\n2. f to c\n");
    System.out.println("enter choice");
    Scanner sc =new Scanner(System.in);
    int ch=sc.nextInt();
    if(ch==1){
        System.out.println("enter celcius value:");
        float c=sc.nextFloat();
        float f=(c*9/5)+32;
        System.out.println("the fahrenheit value is: "+f);
    }
    else if(ch==2){
         System.out.println("enter fahrenheit value:");
        float f=sc.nextFloat();
        float c=(f-32)*5/9;
        System.out.println("the celcius value is: "+c);
    }
    else{
        System.out.println("invalid choice");
        break;
    }
  }
}
}