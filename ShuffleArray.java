public class ShuffleArray {
    public static int[] newShuffledArray(int[] nums, int n){
        int[] array= new int[2 * n];

        int index=0;

        for (int i = 0; i < n; i++) {
            array[index]=nums[i];
            array[index +1]= nums[i+n];
            index+=2;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] nums={4,5,6,732,54,5,654};
        int[] result = newShuffledArray(nums,3);
        for(int arr: result){
            System.out.print(arr+ " ");
        }
    }
}
