class Fibb{
    public static void main(String[] args) {
        int n = 10;

        if(n==0){
            System.out.println(n);
        }

        else{

            int secondlast = 0;
            int last = 1;
            int curr = 0;
            System.out.println(secondlast);
            System.out.println(last);
            for (int i = 2; i <= n; i++) {
                curr = secondlast+last;

                secondlast = last;
                last=curr;
                
                System.out.println(curr+" ");
            }
        }
    }
}