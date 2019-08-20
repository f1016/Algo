class Solution {
    public int minDistance(String s1, String s2) {
        int[][] arr = new int[s1.length()+1][s2.length()+1];
        //arr : = minDistance(word1[0:i-1] , word2[0:j-1])
        
        for(int i = 1 ; i < s1.length() +1; i++){
            arr[i][0] = i;
        }
        
        for(int i = 1 ; i < s2.length() +1; i++){
            arr[0][i] = i;
        }
        
        for(int i = 1 ; i <s1.length()+1 ; i++){  // calculatign all the combination and store the minimum 
            for(int j = 1 ; j <s2.length()+1 ; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)) arr[i][j] = arr[i-1][j-1] ;  
                else{
                    arr[i][j] = Math.min(arr[i][j-1],  // insert the last one to i+1 and comapre the 0-i and 0- j-1
                                Math.min(arr[i-1][j],  //  delete
                                         arr[i-1][j-1])) + 1; //replace
                }
            }
        }
        return arr[s1.length()][s2.length()];
    }
    
}