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
        int count=0;
        ArrayList <Integer> l=new ArrayList <>();
        l.add(a);
        l.add(b);
        l.add(c);
        for(int i : l){
            if(i<0)
            count++;
        }
        System.out.println("the number of negative numbers is:"+count);
    }
}