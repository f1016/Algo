class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int[][] arr = new int[s1.length() + 1][s2.length() +1];
        //arr = the cost of deleting the substring s1.substr[0,i] and s2.substr[0,j]
		
		
        for(int i = 1 ; i < s1.length() + 1 ; i++){
            arr[i][0] = arr[i-1][0] + s1.charAt(i-1);
            
        }
        for(int i = 1 ; i < s2.length() + 1 ; i++){
            arr[0][i] = arr[0][i-1] + s2.charAt(i-1);
        }
        
        for(int i = 1 ; i < s1.length() +1 ; ++i){
            for(int j = 1 ; j < s2.length() +1 ; ++j){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    arr[i][j] = arr[i-1][j-1];
                }
                else{
                    
                    arr[i][j] = Math.min(arr[i-1][j] + s1.charAt(i-1) , // delete s1, come from s1
                                         arr[i][j-1] + s2.charAt(j-1) ); // delete s2, come from s2
                }
                
            }
            
        }
        return arr[s1.length()][s2.length()];
    }
}