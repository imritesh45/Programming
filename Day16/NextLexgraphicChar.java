public class NextLexgraphicChar {
    static String solve(String s , int length){
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            int ascii = (int)s.charAt(i);

            if(ascii==90){
                sb.insert(i,(char)(65));
            }
            else if(ascii==122){
                sb.insert(i, (char)(97));
            }
            else if((ascii>=65 && ascii<97) || (ascii>=97 && ascii<122)){
                sb.insert(i, (char)(ascii+1));
            }
        }
        return sb.toString();
        
    }
    public static void main(String args[]) {
        String str = "abcdxyz";
        int length = str.length();
        System.out.println("Original string: ");
        System.out.println(str);
        System.out.println("New string: ");
        System.out.println(solve(str, length));
    }
    
}
