public class MaxAltitude {
    public static int findHighestAltitude(int[] gain){
        int currentAltitude=0;
        int highestAltitude=0;

        for (int i = 0; i < gain.length; i++) {
            currentAltitude=currentAltitude+gain[i];
            highestAltitude=Math.max(currentAltitude,highestAltitude);
        }
        return highestAltitude;
    }
}
