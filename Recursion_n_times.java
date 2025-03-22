import java.util.Scanner;

public class Recursion_n_times {
    public static void printGM(int n) {
        if (n == 0) {
            return; // Base case: Stop when n reaches 0
        }
        System.out.println("Good morrning");
        printGM(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n times to print :- ");
        printGM(sc.nextInt());
    }
}
