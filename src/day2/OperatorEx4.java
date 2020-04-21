package day2;

public class OperatorEx4 {

	public static void main(String[] args) {
		
		int num1 = 12 , num2 = 10;
	    int num3 = num1 & num2;
	    int num4 = num1 | num2;
	    int num5 = num1 ^ num2;
	    int num6 = ~num1;
//12 : 00000000 00000000 00000000 00001100
//10 : 00000000 00000000 00000000 00001010
//03 : 00000000 00000000 00000000 00001000 (num1 & num2)
//14 : 00000000 00000000 00000000 00001110 (num1 | num2)
//06 : 00000000 00000000 00000000 00000110 (num1 ^ num2)
//     11111111 11111111 11111111 11110011 (~num1)
//     00000000 00000000 00000000 00001101 (음수)

	    System.out.println("num1 & num2 = " + num3);
	    System.out.println("num1 | num2 = " + num4);
	    System.out.println("num1 ^ num2 = " + num5);
	    System.out.println("~num1 = " + num6); 
	    
	    //비트쉬프트 연산자 예제
	    System.out.println("10 << 1 : " + (10 << 1));

	    System.out.println("10 << 2 : " + (10 << 2));

	    System.out.println("10 << 3 : " + (10 << 3));
	    
	    System.out.println("10 >> 1 : " + (10 >> 1));

	    System.out.println("10 >> 2 : " + (10 >> 2));

	    System.out.println("10 >> 3 : " + (10 >> 3));
	    

	}

}