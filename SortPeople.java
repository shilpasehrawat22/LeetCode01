import java.util.Arrays;
import java.util.HashMap;

public class SortPeople {

    public static String[] sortPeople(String[] names, int[] heights) {

        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        int length= heights.length;
        String[] ans = new String[heights.length];
        int ind = 0;
        for (int i = heights.length - 1; i >= 0; i--) {
            ans[ind] = map.get(heights[i]);
            ind++;

        }
        return ans;

    }


    public static void main(String[] args) {
        String[] str= new String[] {"Rocky","Vinny","Jimmy"};
        int[] heights= new int[] {45,54,65,24};

        if (str.length == heights.length) {
          String[] sorted =  sortPeople(str,heights);
        }
        else {
            System.out.println("Error");
        }

    }
}
