public class bubbleSort {
    public static void main(String [] args){
        int []arr={5,4,1,2,3};
        int n=arr.length;
        bubble(arr,n);
        for(int i=0;i<n;i++){
        System.err.print(arr[i]);
        }
    }
    public static void bubble(int[] arr,int n) {
        for(int turn=1;turn<n;turn++){
            for(int i=0;i<n-turn;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }

        }
    }
}
