import java.util.Scanner;

public class Recursion_isPowerOfTwo {

    public static boolean isPowerOfTwo(int n){
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        if (n % 2 != 0) {
            return false;
        }
        return isPowerOfTwo(n/2);
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int num  = 8;
        System.out.println(isPowerOfTwo(num));

    }
}
