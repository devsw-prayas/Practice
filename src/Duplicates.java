import java.util.Arrays;
import java.util.function.Function;

public class Duplicates {
    public int removeDuplicates(int[] nums) {
        //The array is sorted
        if(nums.length > 30000|| nums.length < 1) return -1;
        for(int i : nums){
            if(i > 100 || i < -100) return -1;
        }
        int j = 0;
        for(int i = 0; i < nums.length-1; i++) {
            for (j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) nums[j] = -101;
                else break;
            }
            i = j-1;
        } //Delete duplicates
        //Now start shifting elements
        int pos = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != -101)
                nums[pos++] = nums[i];
        }
        Arrays.fill(nums, pos, nums.length, -101);
        int len = 0;
        for (int num : nums) if (num != -101) len++;
        return len;
    }
    public static void main(String[] args) {
        Duplicates d = new Duplicates();
        System.out.println(d.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));

    }
}
