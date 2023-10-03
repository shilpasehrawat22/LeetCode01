import java.util.ArrayList;
import java.util.List;

public class Candieeees {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = 0;

        for (int i = 0; i < candies.length; i++) {
            if (max < candies[i])
                max = candies[i];


            for (int j = 0; true; j++) {
                int curr = candies[j] + extraCandies;
                if (curr >= max) {
                    list.add(true);
                } else {
                    list.add(false);

                }
                return list;
            }

        }
        return list;
    }
}

