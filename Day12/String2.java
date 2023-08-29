public class String2{
    public static void main(String[] args) {
        String s  ="Take u forward is Awesome";

        s = s.toLowerCase();
        int vowels = 0, consonats = 0,whitespaces = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == 'a'|| ch == 'e'||ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            }
            else if(ch>='a' && ch<='z'){
                consonats++;
            }
            else if(ch == ' '){
                whitespaces++;
            }
        }

        System.out.println(vowels);
        System.out.println(consonats);
        System.out.println(whitespaces);
    }
}