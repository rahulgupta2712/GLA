public class linear_search {
    public static void main(String []args){    
        int[] arr= {10,20,30,50,70,90};    
        int key = 50;    
        System.out.print(key+" is found at index: "+linearSearch(arr, key));    
    }
    public static int linearSearch(int[] arr, int key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }    
        
}