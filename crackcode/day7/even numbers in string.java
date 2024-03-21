import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String a=sc.next();
       int n=a.length();
       for(int i=0;i<n;i++){
           char ch=a.charAt(i);
           int x=Character.getNumericValue(ch);
       if(x%2 ==0){
           System.out.println(x);
       }
        
    }
    }
}
