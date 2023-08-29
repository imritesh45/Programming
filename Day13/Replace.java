public class Replace{
    public static void main(String[] args) {
        String str = "Take you forward";

        //StringBuffer sb = new StringBuffer(str);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == ' '){
            str = str.substring(0, i)+str.substring(i+1, str.length());
            //sb = sb.substring(0, i) + sb.substring(i+1, str.length());
            }
        }
        System.out.println(str);
    }
}