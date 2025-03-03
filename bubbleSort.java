import java.lang.reflect.Array;
import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = {3,1,0,-1,5,4,2};
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 1; j < arr.length-i ; j++) {
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp =  arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
