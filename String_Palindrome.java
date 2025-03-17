import java.util.Scanner;

public class String_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String :- ");
        String str = sc.nextLine();

        str= str.toLowerCase();

        char charArray[]= str.toCharArray();
        int start = 0;
        int end = str.length()-1;

        boolean isPalindrome = true;

        while (start < end) {
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("No, not a palindrome");
        }
    }
}
