public class fibinacci {
    public static void main(String[] args) {
        int n=10;
        int fibona=fibo(n);
        System.out.println(fibona);

    }
    public static int fibo(int n){
        if(n==0 || n==1)return n;
        return fibo(n-1)+fibo(n-2);
    }
}
