public class binary_search{
    public static void main(String []args){    
        int[] arr= {10,20,30,50,70,90};    
        int key = 50;  
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                System.out.print(key+" is found at index: " +mid );
                break;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
            
    }
}