public class ConcatString {
    public static void main(String[] args) {
        String s1 = "This is not right ";
        String s2 = "thing to do";

        String res = s1+s2;
        System.out.println(res);

        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);

        StringBuilder sb = sb1.append(s2);
        System.out.println(sb);

    }
}
