import java.util.Scanner;

public class String_VowelCounter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Convert to lowercase
        str = str.toLowerCase();
        //counter hai
        int vowelCount =0;
        int i = 0;

        while (i < str.length()) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
            i++;
        }
        System.out.println("Number of vowels: " + vowelCount);

    }
}
