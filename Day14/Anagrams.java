

public class Anagrams {
    static boolean isAngram(String s1, String s2){
        StringBuffer sb1 = new StringBuffer(s1);
        StringBuffer sb2 = new StringBuffer(s2);
        int count = 0;
        if(s1.length()!=s2.length()){
            return false;
        }
       else{
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            for (int j = 0; j < s1.length(); j++) {
                char ch1 = s2.charAt(i);

                if(ch == ch1){
                    count++;
                }
            }
        }
        return count == s1.length();
    }
    }
    public static void main(String[] args) {
        String str1 = "baad"; 
        String str2 = "daab";

        if(isAngram( str1,str2)==true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
