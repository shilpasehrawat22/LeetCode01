public class LengthOfLastWord {

     public  int lengthOfWord(String s){
         String[] words= s.split("\\s");

         if(words.length ==0){
             return 0;
         }

         return words[words.length -1].length();
     }

    public static void main(String[] args) {
        LengthOfLastWord lengthOfLastWord= new LengthOfLastWord();
        String s= "Hey Hi I am the Problem its Me";
        int result = lengthOfLastWord.lengthOfWord(s);
        System.out.println(result);
    }
}
