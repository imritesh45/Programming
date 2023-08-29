public class RmvDpl {
    static String removeDuplicateLetters(String s){
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            int j = 0; 

            for (j = 0; j < s.length(); j++) {
                if(s.charAt(i)==s.charAt(j)){
                    break;

                }
            }
            if(i==j){
                ans+=s.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "cbacdcbc";
        System.out.println("Original String: "+str+"\nAfter removing duplicates: "+removeDuplicateLetters(str));
    
        }
}
