#include <stdio.h>
#include <math.h>
#include <stdlib.h>
#define STACKSIZE 100

struct stack{
	int top;
	char arr[STACKSIZE];
}st;


int push(struct stack *,char);
int pop(struct stack *);
int evaluate(char[]);
int isDigit(char);
void traverse(struct stack *);
int operation(int,int,int);


int main(){
	char arra[STACKSIZE],*p;
	p=arra;
	st.top=-1;
	printf("Enter the expression\n");
	scanf("%s",arra);
	//printf("%s\n", arra);
	printf("%d",evaluate(arra));

}

int isDigit(char temp){
	//printf("%c\n",temp );
	return (temp>='0' && temp<='9');
}

int evaluate(char expr[]){
	int i,val,oper1,oper2;
	char temp;
	for(i=0;expr[i]!='\0';i++){
		if(isDigit(expr[i])){
			push(&st,(int)(expr[i]-'0'));
		}
		else{
			oper2=pop(&st);
			oper1=pop(&st);
			val=operation(expr[i],oper1,oper2);
			push(&st,val);
		}
	}
	return (pop(&st));

}

int operation(int operator,int op1,int op2){
	switch(operator){
		case '+': return (op1+op2); break;
		case '-': return (op1-op2); break;
		case '*': return (op1*op2); break;
		case '/': return (op1/op2); break;
		case '$': return (pow(op1,op2)); break;
		default : printf("Invalid operator found. Program will exit. \n");exit(1);
	}
}

int push(struct stack *ps,char val){
	if(ps->top==STACKSIZE-1){
		printf("Overflow will occur if item is added. You have to pop to add more elements. \n");
		return (0);
	}
	else{
		ps->arr[++(ps->top)]=val;
		return (0);
	}
}

int pop(struct stack *ps){
	if(ps->top==-1){
		printf("No element can be popped, stack is empty\n");
		return (0);
	}
	else{
		return (ps->arr[ps->top--]);
	}

}

void traverse(struct stack *ps){
	char *psa;
	if(ps->top==-1){
		printf("The stack is empty, program will exit\n");
		exit(1);
	}
	psa=ps->arr;
	while(*psa){
		printf("%c ",*psa);
		psa++;
	}
}

