package day9;

public class Square extends Shape{
	
	private static int squareCount;
	
	public void print() { //사각형의 정보 출력
		System.out.println("----------사각형의 정보---------");
		System.out.printf("시작점은 (%d,%d) \n", getLeft(), getUp());
		System.out.printf("가로 : %.2f \n",getWidth());
		System.out.printf("세로 : %.2f \n",getHeight());
		System.out.println("----------------------------");
	}
	//public Square (){} //이 자동으로 생성됨. (이 class에 생성자가 없을경우)
	public Square(int left, int up, double width, int height) {
		//setLeft(left) //라고 할수도 있지만
		//setUp(up) //이렇게 지정하면 4줄을 써야하기때문에
		super (left,up,width,height); //라고 해서 간편하게 불러온다 (부모생성자 호출 : 자식 클래스의 생성자에서만 호출할 수 있다)
		squareCount++; 
	}
	//public Square() { }
	
	public static void printCount() {
		System.out.println("현재까지 만들어진 사각형의 갯수 : " + squareCount);
	}
	
}
