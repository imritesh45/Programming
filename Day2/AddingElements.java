public class AddingElements {
    // static void insertbeginning(int array[],int val,int n){
    //     for (int i = n-1 ; i>=0; i--) {
    //         array[i+1] =array[i];
    //     }
    //     array[0] = val;
    //     System.out.println("Inserting 6 at begining");
    //     for (int i : array) {
    //         System.out.println(+i);
    //     }
    //     System.out.println();
    // }

    // static void insertending(int array[],int val,int n){
    //     array[n] = val;

    //     System.out.println("Inserting 7 at end");
    //     for (int i : array) {
    //         System.out.println(i);
    //     }
    // }

    static void insertatpos(int array[],int val,int pos,int n){
        for (int i = n; i>=pos; i--) {
           array[i] = array[i - 1];

        }
        array[pos-1] = val;

        for (int i : array) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int N = 5, array[] = {1,2,3,4,5,0};


       // insertbeginning(array,6,5);
        insertatpos(array,8,4,5);
       // insertending(array,7,5);


       
    }
}
