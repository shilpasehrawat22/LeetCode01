import java.util.HashMap;
import java.util.Map;

public class GoodPairs  {
    public static int numIdenticalPairs(int[] nums) {
        int[] count = new int[101]; // Assuming the numbers in the array are in the range [0, 100]
        int goodPairs = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            goodPairs += count[num];
            count[num]++;
        }

        return goodPairs;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        int result = numIdenticalPairs(nums);
        System.out.println(result); // Output: 4
    }
}






