public class MissingNumber {

    public static class FigureOut {
        int missingNumber(int[] arr, int n) {
            int sumOfAllElements = n * (n + 1) / 2;
            int sum2 = 0;

            for (int val : arr) {
                sum2 = sum2 + val;
            }
            return sumOfAllElements - sum2;
        }
    }

    public static void main(String[] args) {
    }
}
