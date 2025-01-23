public class selectionSort {
    public static void main(String[] args) {
        int [] arr={4,5,3,2,1};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int idx=i;
            for(int j=i+1;j<n;j++){
                if(arr[idx]>arr[j]){
                    idx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
