package day5;

import day4.TestEx3; //day4 안의 TestEx3파일을 가져온다

//import day4.*; 라고 쓰면 day4에 있는 모든 파일들을 가져온다.
import day5_1.*;

public class ClassEx1 {	
	public static void main(String[] args) {
		
		
		TestEx3.main(null);
		DefaultClassEx1.main(null);
		// DefaultClassEx2.main(null); 
		//DefaultClassEx2 class의 접근제한자가 Default인데 지금 이 파일이랑 패키지가 달라서 호출 불가능.  
		/*DefaultClassEx2는 다른 패키지에 있는 클래스 인데 접근제한자가 Default라서 사용할 수 없기 때문에 에러 발생
		 */
		
		Point p1 = new Point();
		
		p1.x1 = 10;
		p1 = new Point(1,2);
		//p1 = new Point(3,4,5); 매개변수 3개짜리 생성자를 만들지 않았기 때문에 선언 불가능
		//p1.x2 = 10; // Point클래스의 x2는 private 이기 때문에 다른 클래스에서 사용 할 수 없다.
		
		
		
	}

}

//Point : 2차원 좌표평면에서 점 1개를 나타내는 클래스

class Point{
	int x1; //x축의 좌표
	int y1; //y축의 좌표

	private int x2;
	private int y2;
	public int x3; 
	public int y3;
	
	//만들기만 하는건 매개변수가 필요가 없음. (위치는 0,0임. 멤버변수는 기본적으로 0으로 초기화되기때문)
	public Point() {
		x1 = x2 = x3 = 0; //의미없는 초기화. 기본이 0임
		System.out.println("Point의 기본 생성자 호출");
	}
	//생성자는 기본적으로 멤버변수의 초기값을 결정하는 역할을 한다.
	//아래의 코드가 생성자 오버로딩이다.
	public Point(int x, int y) {
		x1 = x2 = x3 = x;
		x1 = x2 = x3 = y;
		System.out.println("Point의 생성자 오버로딩 호출");
	}
}