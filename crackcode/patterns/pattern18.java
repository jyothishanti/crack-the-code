

public class Main
{
   
	public static void main(String[] args) {
	   int n=5;
	   for(int i=0;i<n;i++){
	       int x=(int)(Math.pow(11,i));
	       String y=Integer.toString(x);
	       for(int j=0;j<n-i-1;j++)
	       System.out.print(" ");
	       for(int j=0;j<y.length();j++){
	           System.out.print(y.charAt(j)+" ");
	       }
	       System.out.println();
	   }
	}
}




from math import pow
n=5
for i in range(n):
    x=int(pow(11,i))
    y=str(x)
    for j in range(n-i-1):
        print(end=" ")
    for j in range(i+1):
        print(y[j],end=" ")
    print()
