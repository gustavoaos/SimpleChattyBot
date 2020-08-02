import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        int upperLimit = (int) n;
        long result = 1;

        for (int i = 1; i <= upperLimit; i++) {
            result *= i;
        }

        return result;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}