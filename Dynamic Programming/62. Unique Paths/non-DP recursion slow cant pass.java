class Solution {

    public int walk(int left,int top){

        if(left == 0 || top == 0){
            return 1;
        }
        
        if(left != 0 && top != 0){
            return walk(left , top -1) + walk(left -1 , top);
        }
        
        return 0;
    }
    
    public int uniquePaths(int m, int n) {
       return walk(m-1,n-1);
         
    }
}