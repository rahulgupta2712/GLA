package Lec-4;

public class factorial {
    public static void main(String[] args) {
        int i=5;
        int fac=fact(i);
        System.out.print(fac);
    }
    public static int fact(int n){
        //base case 
        if(n==1)return 1;

        return n*fact(n-1);
    }
}
