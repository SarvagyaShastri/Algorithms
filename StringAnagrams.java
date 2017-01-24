import java.util.*;
class StringAnagrams{
	public static void main(String args[]){
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		String str1,str2, str3;
		str1=sc.nextLine();
		str2=sc.nextLine();
		//System.out.println(sort(str1)+" "+sort(str2));
		str3=str1+str2;
		HashMap<Character, Integer> hash=new HashMap<Character, Integer>();
		char input[]=str3.toCharArray();
		for(char c: input){
			if(hash.containsKey(c)){
				hash.put(c,hash.get(c)+1);
			}
			else{
				hash.put(c,1);
			}
		}
		Set<Map.Entry<Character, Integer>> set = hash.entrySet();
		for(Map.Entry<Character, Integer> me : set) {
			if(me.getValue()%2!=0){
				flag=true;
				break;
			}
			else{
				continue;
			}
		}
		if(flag){
			System.out.println("Not Anagrams");
		}
		else{
			System.out.println("Anagrams");	
		}

	}
}