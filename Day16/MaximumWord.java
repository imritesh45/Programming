class MaximumWord{
    public static void main(String[] args) {
        String s= "Google Doc";

        String ans = "";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=' '){
                count++;
            }
        }
    }
}