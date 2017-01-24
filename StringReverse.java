import java.util.*;
class StringReverse{
	public static void main(String args[]){
		char temp;
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		char inputArray[]=input.toCharArray();
		for(int i=0;i<=(inputArray.length-1)/2;i++){
			temp=inputArray[i];
			inputArray[i]=inputArray[inputArray.length-1-i];
			inputArray[inputArray.length-1-i]=temp;
		}
		for(char ch: inputArray){
			System.out.print(ch);
		}
	}	
}