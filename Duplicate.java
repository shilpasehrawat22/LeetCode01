import java.util.HashMap;

public class Duplicate  {
    public boolean containsAnyDuplicate(int[] nums, int k){
        if(nums== null || nums.length==0|| k<=0){
            return false;
        }
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int num = nums[i];

            if(map.containsKey(num) && i-map.get(num)<=k){
               return true;
            }
            map.put(num,i);
        }
        return false;
    }

    public static void main(String[] args) {
        Duplicate duplicate=new Duplicate();
        int [] nums={1,4,54,3};
        int k=3;
        boolean resule= duplicate.containsAnyDuplicate(nums,k);
        System.out.println(resule);
    }
}
