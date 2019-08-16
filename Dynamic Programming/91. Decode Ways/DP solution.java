/*
	
	when i = 2
	check 1 2 [3] 4 the sum will be same as 1 2 ; (A B C) / (L C) num[2] = num[1] = 2
	check 1 [2 3] 4 then (A W) , combine [2 3] and sum up all the result before i-1
	
	in conclusion: It is just (i-th) = (i-1)-th + (i-2)-th 
	
	special case end with 0:
	0 must be combined with the (i-1)th 

*/

class Solution {
    public int numDecodings(String s) {
        if(s == null || s.length() == 0) {
          return 0;
        }
        
        int num[] = new int[s.length()];
        num[0] = s.charAt(0) != '0' ? 1 : 0;
        
        for(int i = 1 ; i< s.length() ; i++){
            if(Integer.valueOf(s.substring(i, i+1)) < 10 && 
               Integer.valueOf(s.substring(i, i+1)) > 0){
                num[i] = num[i-1]; // doesn't combine the ith one with the one before
            }
			

            if(Integer.valueOf(s.substring(i-1,i+1)) <27 &&         
               Integer.valueOf(s.substring(i-1,i+1)) >9 ){
                num[i] += i > 1 ? num[i-2] : 1 ; // combine the ith one with the one before
            }
        
        }

        return num[s.length()-1];
    }
}
