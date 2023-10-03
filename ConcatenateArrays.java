import java.util.Arrays;

public class ConcatenateArrays {
    public static int[] concatenate(int[] nums) {
        int[] answer = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            answer[i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            answer[i + nums.length] = nums[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int[] concatenatedArray = concatenate(nums);

        System.out.println("Concatenated Array:");
        for (int num : concatenatedArray) {
            System.out.print(num + " ");
        }
    }
}
