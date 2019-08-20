class Solution {
    public int minDistance(String word1, String word2) {
        return find(word1, word1.length() , word2 , word2.length());
    }
    
    public int find(String w1, int l1 , String w2 , int l2){
        int ans;
        if(l1 == 0 && l2 == 0) return 0;
        if(l1 == 0) return l2;
        if(l2 == 0) return l1;
        
        if(w1.charAt(l1-1) == w2.charAt(l2-1)) 
            ans = find(w1, l1 -1 , w2 , l2 -1);
        else{
            ans = Math.min(find(w1, l1 -1 , w2 , l2 -1), //  replace
                  Math.min(find(w1, l1 -1 , w2 , l2),   // delete
                           find(w1, l1 , w2 , l2 -1))) + 1 ; // insert
        }
        
        return ans;
        
    }
}