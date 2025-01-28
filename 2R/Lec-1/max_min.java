public class max_min {
    public static void main(String []args){    
        int[] arr= {10,20,3,5,7,90,100,50};    
        int maxi=arr[0];
        int mini=arr[0];
        for(int i=0;i<arr.length;i++){
            if(maxi<arr[i]){
                maxi=arr[i];
            }
            if(mini>arr[i]){
                mini=arr[i];
            }
        }   
        System.out.println(" minimum value is :"+mini);
        System.out.println(" maximum value is :"+maxi);    
    }
}
