public class removeDuplicates {
    public static int removeDuplicates(int[] nums){
        if(nums.length==0){
            return 0;
        }

        int i=0;
        for (int j = 1; j < nums.length ; j++) {
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
                System.out.println("nums[i]:" + nums[i]);
                System.out.println("nums[j]:" + nums[j]);
            }
        }
        System.out.println("i+1: "+ (i+1));
        return i+1;

    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3, 4, 4, 5};
        int k = removeDuplicates(nums);
        for (int j = 0; j < k; j++) {
            System.out.print(nums[j] + " "); // Output: 1 2 3 4 5
        }
    }
}
