import java.util.*;
class SecondSmallest{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int arr[]=new int[sc.nextInt()];
		System.out.println("Enter array");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		findSmallest(arr);


	}
	static void findSmallest(int arr[]){
		int smallest=Integer.MAX_VALUE;
		int second=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			if(smallest>=arr[i]){
				second=smallest;
				smallest=arr[i];
			}
			else if(smallest<arr[i] && second>=arr[i]){
				second=arr[i];
			}
		}
		System.out.println("Smallest:"+smallest+" Second"+second);
	}
}