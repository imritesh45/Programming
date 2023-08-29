public class MaximumRept {
    public static void main(String[] args) {
        String str = "takeuforward";

        int count[] = new int[256];

        int maxFreq = 0;
        char res = 'a';
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;

            if(count[str.charAt(i)]>maxFreq){
                maxFreq = count[str.charAt(i)];

                res = str.charAt(i);
            }
            
        }
        System.out.println(res);

    }
}
