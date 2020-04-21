package day1;

import java.util.Scanner;

public class exampleVarCasting {

	public static void main(String[] args) {
		
	    System.out.println("정수를 입력하세요\n");

	    Scanner scan = new Scanner(System.in);
	   
	    int num = scan.nextInt();

	    System.out.println("입력한 값은 "+num);
	    
	    scan.close();
	    
		System.out.println(num);

	}

}