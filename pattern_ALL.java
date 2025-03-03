import java.util.Scanner;

public class pattern_ALL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n :- ");
//        int n=sc.nextInt();
        int n=5;
//*
//* *
//* * *
//* * * *
//* * * * *
        int counter =0;
          for(int i=1;i<=n;i++){
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
//* * * * *
//* * * *
//* * *
//* *
//*
        for(int i=n;i>=1;i--){
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println();
//        *
//      * *
//    * * *
//  * * * *
//* * * * *

        int space = n-1;
        int star = 1;
        for(int i=1;i<=n;i++){
            for (int j = 1; j <=space ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=star ; j++) {
                System.out.print("* ");
            }
            space--;
            star++;
            System.out.println();
        }

//        *
//      * *
//    * * *
//  * * * *
//* * * * *

        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            // star
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//            * * * *
//              * * *
//                * *
//                  *
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n+i;j++){
                System.out.print("  ");
            }
            // star
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//1
//12
//123
//1234
//12345
        for(int i=1;i<=n;i++){
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        // A
        //BC
        //DEF
        //GHIJ
        //KLMNO

        char ch = 'A';
        for(int i=1;i<=n;i++){
            for (int j = 1; j <=i ; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

        System.out.println();

        //12345
        //12345
        //12345
        //12345
        //12345
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        //12345
        //1234
        //123
        //12
        //1
        for(int i=n;i>=1;i--){
            for (int j = 1; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

//1
//23
//456
//78910
//1112131415
        int count=1;
        for(int i=1;i<=n;i++){
            for (int j = 1; j <= i ; j++) {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
        System.out.println();

//1
//0 1
//1 0 1
//0 1 0 1
//1 0 1 0 1

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                //even place
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                // odd place
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println();

//1 2 3 4 5
//P Q R S T
//1 2 3 4 5
//U V W X Y
//1 2 3 4 5
        char c ='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i%2==0){
                    System.out.print(c + " ");
                    c++;
                }
                else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }

        System.out.println();
//1
//K L
//1 2 3
//M N O P
//1 2 3 4 5
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%2==0){
                    System.out.print(c +" ");
                    c++;
                }
                else {
                    System.out.print(j +" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(2*j-1  +" ");
            }
            System.out.println();
        }
        System.out.println();

    }
}
