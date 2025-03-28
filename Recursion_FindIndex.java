public class Recursion_FindIndex {

    public static int findIndex(int[] arr, int target, int index) {
        if (index >= arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return findIndex(arr, target, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;

        int index = findIndex(arr, target, 0); // Start from index 0
        System.out.println("Index of " + target + " is: " + index);
    }
}
