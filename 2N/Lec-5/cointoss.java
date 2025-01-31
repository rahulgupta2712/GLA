class Main {
    public static void main(String[] args) {
    tossCoin(3,"");
    }
    public static void tossCoin(int n,String ans) {
        if(n==0){
            System.out.println(ans);
            return;
        }
        tossCoin(n-1, ans+"H");
        tossCoin(n-1, ans+"T");
    }
}