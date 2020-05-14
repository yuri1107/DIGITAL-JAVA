package preparation;

import java.util.Scanner;

public class acmicpcMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		scan.close();
		if (A > B) System.out.println(">");
		if (A < B) System.out.println("<");
		if (A == B) System.out.println("==");
		
	}

}
