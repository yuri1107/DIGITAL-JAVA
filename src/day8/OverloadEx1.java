package day8;

public class OverloadEx1 {

	public static void main(String[] args) {
		//println 메서드 오버로딩 확인을 위한 예제
		System.out.println(5); //void java.io.PrintStream.println(int x)
		System.out.println('5'); //void java.io.PrintStream.println(char x)
		System.out.println("5"); //void java.io.PrintStream.println(String x)
		System.out.println(5.0f); //void java.io.PrintStream.println(float x)
		System.out.println(5.0); //void java.io.PrintStream.println(double x)
		System.out.println(false); //void java.io.PrintStream.println(boolean x)
		System.out.println(5L); //void java.io.PrintStream.println(long x)
		System.out.println((short)5); //void java.io.PrintStream.println(int x) short,byte는 자동으로 int로 변환
		
		//내가 여쭤보고싶었던 부분. 이렇게 매개변수칸을 비워놓으면 오버로딩의 조건을 충족하지 못하는거 아닌가
		System.out.println();
		System.out.println();
		
		printString();
		printString("홍길동");
		printString("홍길동","임꺽정");
		printString("홍길동","임꺽정","이순신");
	}
	//매개변수를 가변인자로하는 메서드 예제
	public static void printString(String...str) {
		for(String tmp : str) {
			System.out.print(tmp + " ");
		}
		System.out.println();
	}

}
