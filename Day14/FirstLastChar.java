public class FirstLastChar{
    public static void main(String[] args) {
        String str = "take u forward is awesome";
       
        StringBuffer sb = new StringBuffer(str);

        for (int i = 0; i < str.length(); i++) {
            char ch = sb.charAt(i);
            if(i==0 || i == str.length()-1){
                sb.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }
            else if(ch==' '){
                sb.setCharAt(i-1,Character.toUpperCase(str.charAt(i-1)));
                sb.setCharAt(i+1, Character.toUpperCase(str.charAt(i+1)));

            }
        }
        System.out.println(sb);
    }
}