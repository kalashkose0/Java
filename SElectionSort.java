import java.lang.reflect.Array;
import java.util.Arrays;

public class SElectionSort {
    public static void main(String[] args) {
        int arr[] = {3,1,0,-2,-32,-1,5,4,2};

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {

            // Assume the current position holds
            // the minimum element
            int min_idx = i;

            // Iterate through the unsorted portion
            // to find the actual minimum
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {

                    // Update min_idx if a smaller element
                    // is found
                    min_idx = j;
                }
            }

            // Move minimum element to its
            // correct position
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
