#include <stdio.h>
#include <malloc.h>

struct Node{
	int data;
	struct Node *next;
};
struct Node *head=NULL;

void insertNode(int);
void insertAfter(int);
void traverse();
void swap(struct node **, int, int);

int main(){
	int item,val,s_item1,s_item2;
	printf("Enter 6 items to be inserted at the beginning\n");
	scanf("%d",&item);
	insertNode(item);
	scanf("%d",&item);
	insertNode(item);
	scanf("%d",&item);
	insertNode(item);
	scanf("%d",&item);
	insertNode(item);
	scanf("%d",&item);
	insertNode(item);
	scanf("%d",&item);
	insertNode(item);
	printf("You have entered\n");
	traverse();
	printf("Enter 2 nodes to be swapped\n");
	scanf("%d%d",&s_item1,&s_item2);
	swap(&head,s_item1,s_item2);
}

void swap(struct Node **list,int X, int Y){
	struct Node *prevX,*currentX,*prevY,*currentY;
	currentX=currentY=*list;
	prevY=prevX=NULL;
	if(X==Y){
		printf("Same elements cannot be swapped\n");
		return;
	}
	while(currentX!=NULL && X!=currentX->data){
		prevX=currentX;
		currentX=currentX->next;
	}

	while(currentY!=NULL && Y!=currentY->data){
		prevY=currentY;
		currentY=currentY->next;
	}

	if(prevX==NULL || prevY==NULL){
		printf("We have a head element to swap\n");
	}
	else{

	}
}

void insertAfter(int item){
	struct Node *temp=head,*node;
	node=(struct Node *)malloc(sizeof(struct Node));
	node->data=item;
	while(temp->next!=NULL){
		temp=temp->next;
	}
	temp->next=node;
	node->next=NULL;

}
void insertNode(int item){
	struct Node *node;
	node=(struct Node *)malloc(sizeof(struct Node));
	node->data=item;
	node->next=head;
	head=node;
}

void traverse(){
	struct Node *temp=head;
	while(temp!=NULL){
		printf("%d\n", temp->data);
		temp=temp->next;
	}
}