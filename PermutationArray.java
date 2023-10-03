public class PermutationArray {
    public static int[] buildArray(int[] nums){
        int[] newArray= new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            newArray[i]=nums[i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] newArray={43,54,34,55,66,88,22};
        int[]arr = buildArray(newArray);
        for (int narr: arr
             ) {
            System.out.print(narr+"  ");
        }
    }
}
