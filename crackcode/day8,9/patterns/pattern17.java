

public class Main
{
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
	public static void main(String[] args) {
	    int n=5;
		for(int i=0;i<n;i++){
		    for(int j=0;j<n-i-1;j++){
		        System.out.print(" ");
		    }
		    for(int j=0;j<i+1;j++){
		        System.out.print(factorial(i)/(factorial(j)*factorial(i-j))+" ");
		    }
		    System.out.println();
		}
	}
}
