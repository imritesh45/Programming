public class Anagram2 {
    static boolean checkAnagrams(String s1, String s2){
        int freq[] = new int[26];

        if(s1.length()!=s2.length()){
            return false;
        }

        else{

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)-'A']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            freq[s2.charAt(i)-'A']--;
        }

        for (int i = 0; i < 26; i++) {
            if(freq[i]!=0){
                return false;
            }
            
        }
     }
        return true;
    }
    public static void main(String[] args) {
    String Str1 = "INTEGER";
    String Str2 =  "TEGERNI";
    System.out.println(checkAnagrams(Str1, Str2));
    }
}
