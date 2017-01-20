#include <stdio.h>
#include <malloc.h>
int find_elements(int *ap, int, int, int, int);

int main(){
	int *arr,sum, i,size;
	printf("Enter size of array\n");
	scanf("%d",&size);
	arr=(int *)malloc(sizeof(int)*size);
	printf("Enter elements is sorted order (increasing)\n");
	for(i=0;i<size;i++){
		scanf("%d",&arr[i]);
	}
	printf("Enter Sum\n");
	scanf("%d",&sum);
	if (find_elements(arr, sum, size, 0, size-1)){
		printf("Yay\n");
	}
	else{
	printf("Neah\n");	
	} 
}

int find_elements(int *ap, int sum, int size, int start, int end){
	
	if (ap[end]+ap[start]==sum){
		printf("The elements are%d %d\n",ap[end],ap[start]);
		return(1);
	}
	else if(ap[end]+ap[start]>sum){
		find_elements(ap, sum,size, start, --end);
	}
	else if(ap[end]+ap[start]<sum){
		find_elements(ap, sum,size, ++start, end);
	}
	else{
		return(0);
	}

}
