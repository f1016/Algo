/*LOGIC:
	i l    recur1 => i l  => recur2 => i l => PRINT
	0 0 A-A		 1 1 B-B           2 2 => ABC	   
	0 0              2 1               2 2 => ACB
	1 0 A-B		 1 1 A-A           2 2 => BAC
	1 0              2 1 A-C           2 2 => BCA
	...
	
	just fix one by one 
	
	TIME: O(n!) SPACE: O(n)
	
*/
#include <stdio.h>

void swap(char arr[] , int l , int r){
	int temp = arr[r];
	arr[r] = arr[l];
	arr[l] = temp;
	
}
void permutate(char arr[], int l , int r){
	int i;
	if( l == r)
		printf("%s\n",arr);
	else{
		for(i = l ; i <r ; i++){
			swap(arr ,l ,i );
			permutate(arr ,l+1 ,r );
			swap(arr ,l ,i );
		}
	}
}

int main(){
	char arr[] = {'a','b','c'};
	permutate(arr,0,3);
}
