import java.util.Scanner;

public class String_substring_range {

    public static String SubString(String str, int start, int end) {

        String substr = "";

//               // Fix: Ensure end does not exceed the string length
//        end = Math.min(end, str.length());

        for (int i = start; i < end; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine(); // Define str before passing

        System.out.println("Enter start index: ");
        int start = sc.nextInt();

        System.out.println("Enter end index: ");
        int end = sc.nextInt();

        // Fix: Pass correctly defined str to SubStrinng()
        System.out.println("Substring: " + SubString(str, start, end));

    }
}
