

/*
Backward solution
It can handle the 0 easily if two consecutive 0 exist ==> all 0 after all 
and special case 10 20

*/

public class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        if (n == 0) return 0;
        
        int[] num = new int[n+1];
        num[n]  = 1;
        num[n-1] = s.charAt(n-1) != '0' ? 1 : 0;
        
        for (int i = n - 2; i >= 0; i--)
            if (s.charAt(i) == '0') continue;
            else num[i] = (Integer.valueOf(s.substring(i,i+2)) < 27) ? num[i+1]+num[i+2] : num[i+1];
        
        return num [0];
    }
}