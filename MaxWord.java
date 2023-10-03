public class MaxWord {
    public static int maxWords(String[] sentences) {
        int maxWordCount = 0;

        for (String sentence : sentences) {
            String[] words = sentence.split(" "); // Split the sentence into words
            int wordCount = words.length; // Count the words in the sentence
            maxWordCount = Math.max(maxWordCount, wordCount);
        }

        return maxWordCount;
    }

    public static void main(String[] args) {
        String[] sentences = {
                "alice and bob love leetcode",
                "i think so too",
                "this is great thanks very much"
        };

        int result = maxWords(sentences);
        System.out.println(result); // Output: 6
    }
}
