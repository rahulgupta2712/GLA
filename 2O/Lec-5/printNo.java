public class printNo {
    public static void main(String[] args) {
        printNumbers(10);
    }
    public static void printNumbers(int n){
        if(n<=0)
            return;

        // printNumbers(n-1);           //accending order
        System.out.println(n);
        printNumbers(n-1); // decending order
    }
}
