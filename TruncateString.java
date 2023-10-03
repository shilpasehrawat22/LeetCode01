public class TruncateString {
    public static String truncateSenstence(String s, int k){
        String arr[] = s.split(" ");
        StringBuilder sb= new StringBuilder();

        for (int i = 0; i < k; i++) {
            if (i<arr.length){
                sb.append(arr[i]).append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s= "Hello";
        truncateSenstence(s,5);
    }
}
