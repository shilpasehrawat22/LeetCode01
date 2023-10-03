public class MojorityElement {
    public int majorityElement(int[] nums){
        //initialize the majority candidate to the first element.
        int majority = nums[0];
        int count=1; //Initialize the count of the majority candidate to 1.

        /*
        It initializes two variables: majority and count. majority represents the current candidate for the majority element,
        and count represents the count of occurrences of the current candidate.
        * */
        for(int i=1; i<nums.length; i++){
            if(count == 0){
                majority = nums[i];
                count=1;
            }
            else if(nums[i] == majority){
                count++;
            }
            else {
                count--;
            }
        }
        return majority;
    }
}
