import java.util.Scanner;

public class marksheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks here :- ");
        int marks = sc.nextInt();

        System.out.println("----- M A R K S--------");

        if(marks>90){
            System.out.println("Excellent");
        }

        else if(marks>80 && marks<=90){
            System.out.println("good");
        }
        else if(marks>70 && marks<=80){
            System.out.println("Fair");
        }
        else if(marks>60 && marks<=70){
            System.out.println("meets exceptions");
        }
        else if(marks<=60){
            System.out.println("par");
        }


    }
}
