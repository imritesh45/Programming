public class FindingSubstring {
    public static void main(String[] args) {
        String str1 = "takeuforward";
        String str2 = "forward";
        
        for (int i = 0; i < str1.length(); i++) {
            int temp = i;
            int j =0;
            for ( j = 0; j < str2.length(); j++) {
                if(str1.charAt(temp)!=str2.charAt(j)){
                    break;
                }

                temp++;

                
            }
            if(j==str2.length()){
                System.out.println("It contains substring");
            }

    
        }
                int indexof = str1.indexOf(str2);

            System.out.println("The substring starts from "+indexof);
    }
}
