import java.util.Arrays;

public class searchmatrix {
    public static void main(String[] args) {

        int arr[][]={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println(Arrays.toString(search(arr,11)));

    }
    static int[] search(int [][]matrix,int target){
//        int row =0;
//        int col= matrix.length-1;
//
//        while (row < matrix.length && col >=0){
//            if(matrix[row][col] == target){
//                return new int[]{row,col};
//            }
//            if(matrix[row][col] < target){
//                row++;
//            }
//            else {
//                col--;
//            }
//        }
//        return new int[]{-1,-1};

        for(int i=0;i<=matrix.length-1;i++){
            int start =0;
            int end = matrix[i].length-1;
            while(start <= end){
                int mid =start +(end-start)/2;
                if(matrix[i][mid] == target){
                    return new int[]{start,end};
                }
                else if(matrix[i][mid]>target){
                    end = mid-1;
                }
                else start = mid+1;
            }
        }
        return new int[]{-1 ,-1};

    }
}
