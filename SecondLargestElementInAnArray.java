import java.util.Scanner;

public class SecondLargestElementInAnArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter the size of array:- ");
//        int size= sc.nextInt();
//
//        int arr[] = new int[size];
//
//        for (int i = 0; i < size; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));

        int arr[] = {10,20,30,40,50,60,70,80,110};

        int max=arr[0];
        int smax=arr[0];

        for (int i = 0; i <= arr.length-1 ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max :- "+max);

        for (int i = 0; i <= arr.length-1 ; i++) {
            if(arr[i]>smax && arr[i] != max){
                smax=arr[i];
            }
        }
        System.out.println("smax :- "+smax);

    }
}
