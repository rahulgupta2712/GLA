
import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;

public class 3Sum{
    public static void main(){
        int []arr={-1,0,1,2,-1,-4};
        Arrays.sort(arr);
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int j=i+1;
            int k=arr.length-1;
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            while(j<k){
                int total=arr[i]+arr[j]+arr[k];
                if(total<0){
                    j++;
                }
                else if(total>0){
                    k--;
                }
                else{  
                    res.add(Arrays.asList(arr[i],arr[j],arr[k]));
                    j++;
                    while(j<k){
                        if(arr[j]==arr[j-1])j++;
                        else break;
                    }
                }
            }
        }
    }
}