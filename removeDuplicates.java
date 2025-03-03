import java.util.HashSet;
import java.util.Scanner;
class removeDuplicates {
    public int removeDuplicates(int[] nums) {

       int index = 0;
       HashSet<Integer> set = new HashSet<>();
       
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (set.add(num)) {
                nums[index++] = num;
            }
        }
        
       return set.size();

    }
}