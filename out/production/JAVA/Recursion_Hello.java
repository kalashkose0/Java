public class Recursion_Hello {
    public static void printHello(int n) {
        if (n == 0) {
            return; // Base case: Stop when n reaches 0
        }
        System.out.println("Hello");
        printHello(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        printHello(5); // Call the function to print "Hello" 5 times
    }
}
