class Solution {
    
    public int minimumDeleteSum(String s1, String s2) {
        
        int[][] arr = new int[s1.length()+1][ s2.length()+1];
        for(int i = 0 ; i <s1.length()+1 ; i++){
            for(int j = 0 ; j < s2.length()+1 ; j++){
                arr[i][j] = Integer.MAX_VALUE;
            }
        }
        return find(s1,s1.length(), s2,s2.length() , arr);
    }
    
    public int find(String s1, int l, String s2, int r ,int[][] arr){
        if(l == 0 && r == 0) return 0;
        
        if(arr[l][r] != Integer.MAX_VALUE) return arr[l][r];
       
        if(l == 0) return arr[l][r] = (find(s1 , l , s2 , r-1 , arr) + s2.charAt(r-1));
        
        if(r == 0) return arr[l][r] = (find(s1 , l-1 , s2 , r , arr) + s1.charAt(l-1));

        if( s1.charAt(l-1) == s2.charAt(r-1)) return arr[l][r] = find(s1,l-1,s2,r-1,arr);
        
        return Math.min(find(s1 , l-1 , s2 , r , arr) + s1.charAt(l-1) , 
                        find(s1 , l , s2 , r-1 , arr) + s2.charAt(r-1));
        
    }
    
}