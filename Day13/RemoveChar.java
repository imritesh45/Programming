public class RemoveChar {
    static String removeDigit(String s){
        s = s.toLowerCase();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z' && ch != ' ' ){
                
                sb.append(ch);
                
                
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "take12% *&u ^$#forward";

        System.out.println(removeDigit(str));
    }
}
