import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name :- ");
        String name = sc.nextLine();
//        String name = sc.nextLine();      space ke baad ke string nhi aa rhe the
        System.out.println("hello MR. "+name);

        int n = Integer.parseInt(sc.nextLine());
        String k = sc.nextLine();

        for (int i = 1; i <=9 ; i++) {
            System.out.println(i);
        }

    }
}
