import java.util.Scanner;
class RemoveChar{
	public static void main(String argsp[]){
		Scanner sc=new Scanner(System.in);
		String input=new String(sc.nextLine());
		char str[]=input.toCharArray();
		if (str == null) return;
		int len = str.length;
		if (len < 2) return;
		int tail = 1;

		for (int i = 1; i < len; ++i) {
			int j;
			for (j = 0; j < tail; ++j) {
				if (str[i] == str[j]) break;
			}
			if (j == tail) {
				str[tail] = str[i];
				++tail;
			}
		}
		str[tail] = 0;
		for(char c: str){
			System.out.print(c);
		}
		}



	}	
