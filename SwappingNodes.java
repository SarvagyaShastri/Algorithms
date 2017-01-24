class SwappingNodes extends LinkedList{

	public int swapNodes(int val1, int val2){
		Node tempA=head, lagA=null, tempB=head, lagB=null, temp=null;
		if(val1==val2){
			return 0;	
		}
		while(tempA.item!=val1){
			lagA=tempA;
			tempA=tempA.next;
		}
		while(tempB.item!=val2){
			lagB=tempB;
			tempB=tempB.next;
		}
		if(lagA!=null){
			lagA.next=tempB;
		}
		else{
			head=tempB;
		}
		if (lagB!=null) {
			lagB.next=tempA;
		}
		else{
			head=tempA;
		}
		temp=tempB.next;
		tempB.next=tempA.next;
		tempA.next=temp;

		return 1;
	}

	public static void main(String args[]){
		SwappingNodes list1=new SwappingNodes();
		list1.frontPush(5);
		list1.frontPush(7);
		list1.frontPush(9);
		list1.frontPush(11);
		list1.backPush(4);
		list1.betweenPush(30,5);
		//list1.traverseList();
		//list1.deleteFirst();
		//list1.deleteLast();
		//list1.deleteElement(9);
		list1.frontPush(50);
		list1.frontPush(60);
		list1.backPush(100);
		//list1.deleteAtIndex(2);
		//list1.traverseList();
		list1.traverseList();
		int ret=list1.swapNodes(60,100);
		list1.traverseList();
	}	
}

