package day9;

public class RecursiveEx3 {

	public static void main(String[] args) {
		ClassB b = new ClassB();
		b.print();
		b.print(1);
		System.out.println(sum(10));
		System.out.println(sum(-10,-1));
	}
	
	//1부터 10까지 합을 구하는 코드를 재귀메소드로 작성 <- 출제자의 의도를 모르겠음
	/* 10+9+8+7+6+5+4+3+2+1
	 * 10 + sum(9)
	*/
	
	//아래 코드는 무조건 양수만 가능
	public static int sum(int num) {
		if (num < 0) return 0;
		if (num == 1) return 1; 
		return num + sum(num-1);
	}
	
	/* sum(1,10) : 1에서 10까지의 합
	 * 10 + sum(1,9) : 10 + 1에서 9까지의 합
	*/
	//아래 코드는 음수도 가능, 재사용성이 높다.
	public static int sum(int min, int max) {
		if (min > max) {return 0;} //순서 바뀌면 계산안해버림
		if (max == min) {return min;}
		return max + sum(min, max-1);
	}
	
	//위의 sum 메소드 두개는 오버로딩이다.

}

class ClassA {
	public void print() {
		System.out.println("class A");
	}
}

class ClassB extends ClassA {
	//print메소드를 오버라이딩
	public void print() {
		//printf(); //재귀호출이되어 스택오버플로우 에러가 발생한다.
		super.print(); //목적에 맞게 부모클래스를 의미하는 super를 붙여줘야 한다.
		System.out.println("class B");
	}
	//print 메소드를 오버로딩
	public void print(int num) { //이때는 오버로딩이 되어 문제생기지않음
		print(); 
		System.out.println("class B");
	}
	
	
	
}
