public class reverse_array {
    public static void main(String []args){    
        int[] arr= {10,20,30,50,70,90};    
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+ " ");
        }

    }
}
