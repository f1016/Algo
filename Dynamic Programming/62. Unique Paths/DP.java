// Time : O(n*m), Space: O(n*m)

class Solution {

    public int uniquePaths(int m, int n) {
        if( n <= 1 || m <= 1){
            return 1;
        }
        
        int map[][]= new int[m][n];

        for(int i = 0 ; i < m ; i ++){
            map[i][0] = 1;
        }
                
        for(int i = 0 ; i < n ; i ++){
            map[0][i] = 1;
        }
        
        for(int i = 1 ; i < m ; i ++){
            for(int j = 1 ; j < n ; j ++){
               map[i][j]= map[i-1][j] + map[i][j-1]; 
                
            }
        }
        
        return map[m-1][n-1];
    }
}


//using only 1D array
//LOGIC: since every position is calculated by the top one and the left one
//LOGIC: the one is used to calculated is useless, so we can just replace them
/*
class Solution {

    public int uniquePaths(int m, int n) {
        if( n <= 1 || m <= 1){
            return 1;
        }
        
        int map[]= new int[n];

        for(int i = 0 ; i < n ; i ++){
            map[i] = 1;
        }
                
        for(int i = 1 ; i < m ; i ++){
            for(int j = 1 ; j < n ; j ++){
               map[j] = map[j] + map[j-1]; 
            }
			printf("%d'n",map[n-1]);
        }
        
        return map[n-1];
    }
}
*/
