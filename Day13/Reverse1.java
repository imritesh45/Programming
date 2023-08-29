public class Reverse1 {
    public static void main(String[] args) {
        String str = "HELLO";
        
       
        StringBuffer sb = new StringBuffer();

        for (int i = str.length()-1; i >=0; i--) {
            sb.append(str.charAt(i));
        }
        System.out.println(sb);

        //by using Function

        StringBuffer sbb = new StringBuffer(str);
        sbb.reverse();
        System.out.println(sb);

        

    }
}
