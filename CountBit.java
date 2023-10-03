import java.util.ArrayList;
import java.util.List;

public class CountBit {
    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (Integer.bitCount(i) == k) {
                count = count + nums.get(i);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();

        nums.add(0,3);
        nums.add(1,43);
        sumIndicesWithKSetBits(nums,5);
    }
}