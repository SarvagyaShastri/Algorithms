import java.util.Scanner;
class LinkedList{
	Node head;
	class Node{
		int item;
		Node next;
		Node(int d){
			item=d;
			next=null;
		}
	}

	public void frontPush(int data){
		Node newnode=new Node(data);
		if(head==null){
			System.out.println("Initializing list with "+data);
			head=new Node(data);
		}
		else{
			newnode.next=head;
			head=newnode;
		}
	}

	public void backPush(int data){
		if(head==null){
			head=new Node(data);
		}
		else{
			Node newNode=new Node(data);
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=newNode;
		}
	}

	public int findLength(){
		Node counter=head;
		int count=0;
		while(counter!=null){
			count++;
			counter=counter.next;
		}
		return count;
	}

	public void betweenPush(int data, int val){
		if(this.findLength()>2){
			Node temp=head;
			while(temp.next.item!=val){
				temp=temp.next;
				if(temp.next==null){
					break;
				}
			}
			if(temp.next==null){
				System.out.println("Value not present");

			}
			else if(temp.next.item==val){
				Node newnode=new Node(data);
				Node dummy=temp.next;
				newnode.next=dummy;
				temp.next=newnode;
			}
			
		}
		else{
			System.out.println("List must be atleast of size 2 to insert in between");
		}
	}

	public void deleteFirst(){
		head=head.next;
	}

	public void deleteLast(){
		Node temp=head,lag=null;
		while(temp.next!=null){
			lag=temp;
			temp=temp.next;
			
		}
		lag.next=null;
	}

	public void deleteElement(int value){
		Node temp=head, lag=null;
		if(head.item==value){
			head=head.next;
		}
		else{
			while(temp.item!=value){
				lag=temp;
				temp=temp.next;
				if(temp==null){
					System.out.println("Element cannot be deleted as it is not present");
				}
			}
			if(temp.item==value){
				if(temp.next==null){
					lag.next=null;
				}
				else{
					lag.next=temp.next;
				}
			}
		}
	}
	
	public void deleteAtIndex(int index){
		if(index>=findLength()){
			System.out.println("index out of bounds");
		}
		else{
			Node temp=head,lag=null;
			int count=0;
			while(count!=index){
				lag=temp;
				temp=temp.next;
				count++;
			}
			if(count==index){
				lag.next=temp.next;
			}
		}

	}

	public void traverseList(){
		System.out.println("");
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.item+"->");
			temp=temp.next;
		}

	}


	public static void main(String args[]){
		LinkedList list1=new LinkedList();
		LinkedList list2=new LinkedList();
		/*list1.frontPush(5);
		list1.frontPush(7);
		list1.frontPush(9);
		list1.frontPush(11);
		list1.backPush(4);
		list1.betweenPush(30,5);
		list1.traverseList();
		list1.deleteFirst();
		list1.deleteLast();
		list1.deleteElement(9);
		list1.frontPush(50);
		list1.frontPush(60);
		list1.backPush(100);
		list1.deleteAtIndex(2);
		list1.traverseList();*/
	}
}