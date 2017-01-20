#include <stdio.h>
#include <malloc.h>

struct Node{
	int data;
	struct Node *next;
};
struct Node *head=NULL,*head_new=NULL;

void insertNode(int);
void insertAfter(int);
void traverse(struct Node *);
void insertBetween(int);
void reverse_list(struct Node *,struct Node *);

main(){
	int item,val;
	printf("Enter item to be inserted at the beginning\n");
	scanf("%d",&item);
	insertNode(item);
	scanf("%d",&item);
	insertNode(item);
	scanf("%d",&item);
	insertAfter(item);
	//printf("Enter item to be stored after ..\n");
	//scanf("%d%d",&val);
	//insertBetween(val);
	printf("You Entered\n");
	traverse(head);
	printf("Reversal\n");
	reverse_list(head,NULL);
	traverse(head_new);
}

void reverse_list(struct Node *temp, struct Node *prev){
	struct Node *temp2;
	if(temp->next!=NULL){
		reverse_list(temp->next,temp);
	}
	if(head_new==NULL){
		printf("Here\n");
		temp2=(struct Node *)malloc(sizeof(struct Node));
		temp2->data=temp->data;
		temp2->next=(struct Node *)malloc(sizeof(struct Node));
		head_new=temp2;
	}
	else{
	//temp2=(struct Node *)malloc(sizeof(struct Node));
	temp2->data=temp->data;
	temp2->next=(struct Node *)malloc(sizeof(struct Node));
	}
	printf("%d\n",temp2->data);
	temp2=temp2->next;
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

void insertBetween(int val){
	struct Node *temp=head,*prev=NULL, *node;
	node->data=val;
	while(val>temp->data && temp!=NULL){
		prev=temp;
		temp=temp->next;
	}
	node->next=temp;
	prev->next=node;
}

void traverse(struct Node *temp){
	while(temp!=NULL){
		printf("%d\n", temp->data);
		temp=temp->next;
	}
}