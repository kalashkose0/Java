import java.util.Arrays;
import java.util.Scanner;

public class LargestElementInAnArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:- ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i =0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
//        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <= arr.length-1; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}