import java.util.Scanner;

public class ReverseOfString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = sc.next().toLowerCase();

		String rev = "";

		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			rev = ch + rev;
		}
		System.out.println(rev);
	}
}

