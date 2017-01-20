#include<stdio.h>
#include<stdlib.h>
void main(){
	int i,n,a,result=0;
	printf("Enter n from 0 to 100\n");
	scanf("%d",&n);
	printf("%d\n", n);
	if(n<0 || n>100 || n%2==0){
		printf("Fuck you, invalid input\n");
		exit(0);
	}
	printf("Enter n elements\n");
	for(i=0;i<n;i++){
		scanf("%d",&a);
		if(a<0 || a>100){
			printf("Fuck you, invalid input, enter values b/w 0 and 100\n");
			exit(0);
		}
		result^=a;
	}
	printf("\n The odd integer is %d",result);
	

}
