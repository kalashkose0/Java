import java.util.Scanner;

public class String_UpdateEvenPositions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String :- ");
        String str = sc.nextLine();
        str = str.toLowerCase();// lower case

        // Convert string to char array because strings are immutable
        char[] char_str = str.toCharArray();

        for (int i=0;i<char_str.length;i++){
            if(i%2 == 0){
                char_str[i]='a';
            }
        }

        // Convert back to string and print
        System.out.println("Updated String is: " + new String(char_str));


    }
}
