import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	String S = sc.nextLine();
	int[] arr = new int[26];
	int max=-100;
	int equ=0;
	int check=0;
	for(int i=0;i<S.length();i++) {
		char x=S.charAt(i);
		int first=97;
		int second=65;
		int k=0;
		while(true) {
			if(x==first||x==second) {
				arr[k]++;
				break;
			}
			else {
				first++;second++;k++;
			}
		}
	}
	for(int i=0;i<26;i++) {
		if(arr[i]>max) {
			max=arr[i];
			check=i;
		}
		else if(arr[i]==max) {
			equ=max;
		}
	}
	if(max==equ) {
		System.out.println("?");
	}
	else {
		char result =(char) (65+check);
		System.out.println(result);
	}
	}
}