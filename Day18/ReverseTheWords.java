public class ReverseTheWords {
    public static void main(String[] args) {
        String s="this is an amazing program";

        String [] word = s.split(" ");

        for (int i = word.length-1; i >=0; i--) {
            System.out.println(word[i]);
        }

    }
}
