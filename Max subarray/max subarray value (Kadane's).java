// find the largest num up to ith 
// sort it and take the largest value

//largest subarray value 

class Solution {
    public int maxSubarray(int[] arr) {
		for(int i = 0 ; i < arr.length - 1 ; i++){
			diff[i] = arr[i] - arr[i-1];
		}
		
		int[] largeSubarr = new int[diff.length] ;
		int start = 0;
		int end = 0;
		for(int i = 0 ; i < diff.length ; i++){
			largeSubarr[i] = Math.max(diff[i] , max[i-1] + diff[i]); //find the largest subarry value up to i-th

		}
		Arrays.sort(largeSubarr);
		
		
     return largeSubarr[largeSubarr.length -1] 
;   
    }
}