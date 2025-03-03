import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // while loop

        int i=1;
        System.out.println("While");
        while (i<=9){
            System.out.println(i);
            i++;
            //i=i+1;
        }
        System.out.println("done");

        System.out.println("For");
        for (i=1;i<=9;i++){
            System.out.println(i);
        }
        System.out.println("done");

    }
}
