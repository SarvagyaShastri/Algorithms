import java.util.*;
class SortedArrayTree{
	Node root;
	class Node{
		int data;
		Node right;
		Node left;

		public Node(int d){
			data=d;
			right=null;
			left=null;
		}
	}
 public void addNode(int arr[]){
 	Queue<Node> queue=new LinkedList<Node>();
 		
			root=new Node(arr[0]);
			System.out.print(root.data);
			queue.add(root);	
			int i=1;
			Node temp=root;
		while(!queue.isEmpty()&&i<10){
			temp=queue.poll();
			if(temp.left==null && i<10){
				temp.left=new Node(arr[i++]);
				queue.add(temp.left);
			}	
			
			if (temp.right==null&&i<10) {
				temp.right=new Node(arr[i++]);
				queue.add(temp.right);
			}
			
		}
	}
public void levelOrderTraverse(){
		Node temp=root;
		Queue<Node> queue=new LinkedList<Node>();
		queue.add(temp);
		while(!queue.isEmpty()){
			Node demo=queue.poll();
			System.out.print(demo.data+" ");
			if(demo.left!=null)
				queue.add(demo.left);
			if(demo.right!=null)
				queue.add(demo.right);
		}
	}

	public static void main(String agrs[]){
		int arr[]=new int[]{1,2,3,4,5,6,7,8,9,10};
		SortedArrayTree tree=new SortedArrayTree();
		tree.addNode(arr);	
		tree.levelOrderTraverse();
	}

	
}