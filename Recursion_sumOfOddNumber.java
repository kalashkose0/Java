import java.util.Scanner;

public class Recursion_sumOfOddNumber {

    public static int oddSum(int a, int b) { // corrected return type

        if (a > b) {
            return 0;
        }

        if (a % 2 != 0) { // a is odd
            return a + oddSum(a + 2, b);
        } else { // a is even
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("a :- >  ");
        int a = sc.nextInt();
        System.out.println("b :- >  ");
        int b = sc.nextInt();

        int sum = oddSum(a, b);

        System.out.println("Recursion_sumOfOddNumber of a & b is :- " + sum);

        sc.close(); // to close scanner.
    }
}