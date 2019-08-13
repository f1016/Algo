#include <stdio.h>

void swap(char arr[] , int l , int i){
	int temp = arr[i];
	arr[i] = arr[l];
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
