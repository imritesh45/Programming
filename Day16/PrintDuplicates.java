public class PrintDuplicates{
    public static void main(String[] args) {
        String str= "sinstriiintng";

        int freq[] = new int[26];
         
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)-'a']++;
        }
        for (int i = 0; i < 26; i++) {
         if (freq[i] > 1)
            {
                System.out.print((char)(i + 'a'));
                System.out.print(freq[i]+" ");
               
             }
        }
    }
}