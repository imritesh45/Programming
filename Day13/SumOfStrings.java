public class SumOfStrings {
    public static void main(String[] args) {
       String str = "1xyz23";
    
       String tempsum = "0";
       int sum = 0;

       for (int i = 0; i < str.length(); i++) {
        
        char ch = str.charAt(i);
        
        if(Character.isDigit(ch)){
            tempsum+=ch;
        }
        else{
            sum += Integer.parseInt(tempsum);
            tempsum = "0";
        }

        
       }

      System.out.println(sum+Integer.parseInt(tempsum));

        
      
    }
}
