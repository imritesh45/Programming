class UppercaseToLowercaseViceVersa{
    public static void main(String[] args) {
        String str = "take u forward IS Awesome";
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
          
            int ascii = (int)str.charAt(i);
            if (ascii>=65 && ascii<=90 ) {
                sb.append((char)(ascii+32));
            }
            else if(ascii>=97 && ascii<=122){
                sb.append((char)(ascii-32));
            }
            else if(ascii==' '){
                sb.append(' ');
            }
        }

        System.out.println(sb.toString());
    }
}