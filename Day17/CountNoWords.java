public class CountNoWords {
    public static void main(String[] args) {
        String str = "HI AMY AND JAY";

        String words[] = str.split(" ");
        int count = 0;
        for (String string : words) {
            count++;
        }
        System.out.println(count);
    }
}
