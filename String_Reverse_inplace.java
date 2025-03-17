import java.util.Scanner;

public class String_Reverse_inplace {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String :- ");
        String str = sc.nextLine();

        char ch[]=str.toCharArray();

        int start = 0;
        int end = str.length()-1;

        while (start < end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;

            start++;
            end--;
        }
        System.out.println("Reversed String: " + new String(ch));

    }
}
