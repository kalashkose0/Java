public class practise {
    public static void main(String[] args) {
        int arr[] = {2,4,6,6,6,8,10};
        int target =6;

        int brr[]={-1,-1};

        for(int i=0;i<= arr.length-1;i++){
            if(arr[i] == target){
                if(brr[0]==-1){
                    brr[0]=i;// pheli occurence le lega.
                }
                else{
                    // akri tkk jayega update.
                    // means ki last occurence le lega
                    brr[1]=i;
                }
            }

        }
        System.out.println(brr[0] +" "+ brr[1]);


    }
}
