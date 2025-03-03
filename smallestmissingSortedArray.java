public class smallestmissingSortedArray {
    public static void main(String[] args) {
        System.out.println("helloe");

//        int arr[] = {1,2,3,5,6,7};
        int arr[] = {1,2,3,4,5,6,7,9};

        for(int i=0;i<arr.length;i++){
            if(arr[i] != (i+1)){
                System.out.println(i+1);
                break;
            }
        }
        System.out.println("done");
    }
}
