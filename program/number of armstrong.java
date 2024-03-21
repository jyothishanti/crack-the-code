import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter upper limit: ");
        int n = sc.nextInt();
        ArrayList<Integer> l = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int num = i; // Assign the current value of i to num
            int digits = (int) (Math.log10(num) + 1); // Count number of digits in num

            while (num > 0) {
                int digit = num % 10;
                sum += Math.pow(digit, digits);
                num /= 10;
            }

            if (sum == i) {
                l.add(i);
            }
        }
        
        System.out.println("Armstrong numbers up to " + n + ": " + l);
    }
}
