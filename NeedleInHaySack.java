public class NeedleInHaySack {
    public  int strStr(String hatstack, String needle){
        int haylen= hatstack.length();
        int needlen= needle.length();

        if(needlen == 0){
            return 0;
        }
        if(haylen< needlen){
            return  -1;
        }
        for (int i = 0; i <= haylen - needlen; i++) {
            if(hatstack.substring(i, i + needlen).equals(needle)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        NeedleInHaySack solution = new NeedleInHaySack();
        String haystack = "hellooll";
        String needle = "ll";
        int result = solution.strStr(haystack, needle);
        System.out.println(result); // Output: 2 (index of the first occurrence of "ll" in "hello")
    }
}
