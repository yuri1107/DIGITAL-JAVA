package day22;

import java.util.*;

public class TestEx1 {

	public static void main(String[] args) {
		
		printDan();

	}
	
	public static void printDan () {
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println();
			
		}
	}

}
