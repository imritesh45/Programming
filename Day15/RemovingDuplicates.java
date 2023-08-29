public class RemovingDuplicates {
    static String removeDuplicateLetters(String s){
        String str = "";
        boolean mp[] = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            if(mp[s.charAt(i)-'a']==false){
                str+=s.charAt(i);
                mp[s.charAt(i)-'a']=true;
            }
        }
        return str;
    }
    public static void main(String[] args) {
    String str = "cbacdcbc";
    System.out.println("Original String: "+str+"\nAfter removing duplicates: "+removeDuplicateLetters(str));

    }
}
