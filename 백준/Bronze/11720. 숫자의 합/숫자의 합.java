import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		int sum=0;
		String a=sc.next();
		for(int i=0;i<T;i++) {
			String c=Character.toString(a.charAt(i));
			sum+= Integer.parseInt(c);
		}
		System.out.println(sum);
	}
}