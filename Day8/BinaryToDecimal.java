class BinaryToDecimal{
    public static void main(String[] args) {
        String s = "1011";

        int n = s.length();
        int ans = 0;
        
        for (int i = n-1; i >=0; i--) {
            if (s.charAt(i)=='1') {
                ans += (int) Math.pow(2, n-1);
            }
        }
        System.out.println(ans);
    }
}