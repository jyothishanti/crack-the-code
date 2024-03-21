import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        char ch=a.charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' ||ch=='U' )
        System.out.println("vowel");
        else
        System.out.println("consonant");
    }
}