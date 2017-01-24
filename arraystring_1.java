import java.util.*;
class FindUniqueChars{
	public static void main(String args[]){
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to be searched for unique charachters");
		String input=sc.nextLine();
		HashMap<Character, Integer> hash=new HashMap<Character, Integer>();
		char letters[]=input.toCharArray();
		for(char c: letters){
			System.out.println(c);
			if (hash.containsKey(c)){
				flag=true;
			}
			else{
				hash.put(c,1);
			}
		}
		if (flag){
			System.out.println("String has repeated charachters");
		}
		else{
		System.out.println("String has unique charachters");	
		}

		//What if you dont have other data structure -- Using index and lastindex
		for(char c: letters){
			if(input.indexOf(c)==input.lastIndexOf(c)){
				continue;
			}
			else{
				flag=true;
			}
		}
		if (flag){
			System.out.println("String has repeated charachters");
		}
		else{
		System.out.println("String has unique charachters");	
		}

	}
}