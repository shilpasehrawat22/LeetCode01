public class DigiElemSum {

    public static int differenceOfSum(int[] nums) {
        int elementSum=0;
        int digitSum=0;

        for(int i=0; i<nums.length; i++){
            int num= nums[i];
            elementSum+=nums[i];
            int x;

            while(num>0){
                x=num%10;
                digitSum=digitSum+x;
                num=num/10;
            }


        }
        return Math.abs(elementSum-digitSum);
    }

    public static void main(String[] args) {
        int[] nums={54,65,3,56,2,54,234,54};
        differenceOfSum(nums);
    }
}

