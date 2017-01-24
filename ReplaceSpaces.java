import java.util.Scanner;

class ReplaceSpaces{
	public static void main(String args[]){
		int spacecount=0, newlength, length;
		Scanner sc=new Scanner(System.in);
		String str="This is a demo test";
		char input[]=new char[100];
		input=str.toCharArray();
		System.out.println("length"+input.length);
		for(char count: input){
			if(count==' '){
				spacecount++;
			}
		}
		length=str.length();
		newlength=length+spacecount*2;
		System.out.println(newlength);
		input[newlength]='\0';
		for(int i=length-1;i>=0;i--){
			System.out.println(i);
			if(str.charAt(i)==' '){
				input[newlength-1]='0';
				input[newlength-2]='2';
				input[newlength-3]='%';
				newlength=newlength-3;
			}
			else{
				input[newlength-1]=str.charAt(i);
				newlength--;
			}
		}
	}
}