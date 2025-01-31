class Solution{
public:  
    // You need to complete this function

    int towerOfHanoi(int n, int from, int to, int aux) {
        // Your code here
        if(n==0)return 0;
        
        int moves=0;
        if(n>0){
            moves+=towerOfHanoi(n-1,from,aux,to);
            moves++;
            moves+=towerOfHanoi(n-1,aux,to,from);
        }
        return moves;
    }
};