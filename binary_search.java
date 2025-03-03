import java.util.Scanner;

public class binary_search {
    public static void main(String[] args) {

        int arr[]={2,3,4,5,14,16,18};
        int target =14;

        int start = 0;
        int end = arr.length-1;

        while(start<=end){

            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else {
                System.out.println(mid);
                return;
            }

        }

        System.out.println("Target not found");
    }
}
