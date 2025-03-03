import java.util.Scanner;
public class MovesZeroToEnd {
    public static void main(String[] args) {
        int  nums[] = {0,1,0,3,12};
        int i=0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }

        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }
}
/*

ArrayList<Integer> temp = new ArrayList<>();
//copy non-zero elements
//from original -> temp array:
        for (int i = 0; i < n; i++) {
        if (a[i] != 0)
        temp.add(a[i]);
        }

// number of non-zero elements.
int nz = temp.size();

//copy elements from temp
//fill first nz fields of
//original array:
        for (int i = 0; i < nz; i++) {
a[i] = temp.get(i);
        }

                //fill rest of the cells with 0:
                for (int i = nz; i < n; i++) {
a[i] = 0;
        }
        return a;
*/
