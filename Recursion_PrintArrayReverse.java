public class Recursion_PrintArrayReverse {

    public  static void reverse(int [] arr,int index){
        if(index<0){
            return;
        }
        System.out.print(arr[index] + " ");
        reverse(arr, index-1);

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Array in reverse order:");

        reverse(arr, arr.length - 1);

    }
}
