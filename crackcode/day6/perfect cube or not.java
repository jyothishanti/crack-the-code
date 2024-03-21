import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        double cubeRoot = Math.cbrt(number);
        if (Math.floor(cubeRoot) == cubeRoot) {
            System.out.println(number + " is a perfect cube.");
        } else {
            System.out.println(number + " is not a perfect cube.");
        }
    }
}
