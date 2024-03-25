import java.util.Scanner;

public class Main {
    public static int fact(int a) {
        int fact = 1;
        if (a == 0 || a == 1)
            return 1; // factorial of 0 and 1 is 1
        else {
            for (int i = 2; i <= a; i++)
                fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter upper limit: ");
        int a = sc.nextInt();
        double s = 0.0; // Initialize to 0.0
        for (int i = 1; i <= a; i++)
            s = s + ((double) (i * i) / fact(i)); // Use floating-point division
        System.out.print(s);
    }
}
