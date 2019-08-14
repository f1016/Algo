// it is a fibonacci sequence 
// since the n-th stair can be come from (n-1)-th / (n-2)-th stair 
// 1 , 2 , 3 , 5 , 8 ...........
// this is DP solution

//Time : O(n) , Space : O(n)
class Solution {
    public int climbStairs(int n) {
        if(n <= 1) return 1;
        
        int fib[] = new int[n];
        fib[0] = 1;
        fib[1] = 2;
        
        for(int i = 2 ; i < n ; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }

        return fib[n-1] ;
    }
}

//Time : O(n) , Space : O(1)
/*
class Solution {
    public int climbStairs(int n) {
        if(n <= 1) return 1;

        first = 1;
        sec = 2;
        
        for(int i = 2 ; i < n ; i++){
            third = sec + first;
			first = sec;
			sec = third;
        }

        return third ;
    }
}
*/