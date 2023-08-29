public class LargestWordInString{
    public static void main(String[] args) {
        String s="Google Doc";

        String[] words = s.split(" ");
        String largestWord = "";
        for (String word : words) {
            if(word.length()>largestWord.length()){
                largestWord = word;
            }
        }
        System.out.println(largestWord);
        
    }
}