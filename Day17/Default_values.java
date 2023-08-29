public class Default_values {
    int add(int x,int y){
        int res  = x+y;

        return res;
    }
    int add(int x,int y,int z){
        int res  = x+y+z;

        return res;
    }
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        Default_values c1 = new Default_values();
        System.out.println(c1.add(2, 5));
        System.out.println(c1.add(1, 2, 8));


    }
}
