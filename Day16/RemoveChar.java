public class RemoveChar{
    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "cefz";

        String ans = "";


        for (int i = 0; i < str1.length(); i++) {
            int flag = 0;
            for (int j = 0; j < str2.length(); j++) {
                
                if(str1.charAt(i)==str2.charAt(j)){
                    flag = 1;
                }
            }
            if(flag!=1){
                ans+=str1.charAt(i);
            }
        }
        System.out.println(ans);
    }
}