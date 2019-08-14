// Time = 2^n Space = O(n)


class Solution {
    public int climb(int from , int to ){
        if(from > to){
            return 0;
        }
        if(from == to){
            return 1;
        }

        return climb(from+1 , to) + climb(from+2 , to);
            
    }
    
    public int climbStairs(int n) {
       return climb(0,n);
    }
}