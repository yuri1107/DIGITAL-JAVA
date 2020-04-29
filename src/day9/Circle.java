package day9;

public class Circle extends Shape {
	private double centerX,centerY; //중심점 계산을 위한 변수 선언
	private static int circleCount;
	
	public void print() { //원형의 정보 출력
		System.out.println("----------원형의 정보----------");
		System.out.printf("중심점은 (%.1f,%.1f) \n", centerX, centerY);
		System.out.printf("반지름 : %.2f \n",getRadius());
		System.out.println("----------------------------");
	}
	public Circle() { circleCount++; }
	public Circle(int left, int up, double radius) {
		super(left, up, radius*2, radius*2); //radius*2를 2번 하는것은 원형의 가로, 세로 길이를 구하려고 하는것이기 때문
		//아래 코드와 같이 계산할 수도 있다
		/*setLeft(left);
		setUp(up);
		setWidth(radius*2);
		setHeight(radius*2);*/
		centerX = left + radius;
		centerY = up - radius;
		circleCount++;
	}
	//아래는 오버라이딩
	public void move(int left, int up) {
		super.move(left, up);
		centerX = left + getRadius(); //어차피 매개변수가 알려주기때문에 getLeft()를 하나 left를 하나 상관없다
		centerY = up - getRadius();
	}
	//아래는 오버로딩 (매개변수가 부모꺼랑 다르다)
	public void resize(double radius) {
		resize(2*radius, 2*radius);
		centerX = getLeft() + radius;
		centerY = getUp() - radius;
	}
	//아래는 메서드
	public double getRadius() {
		return getWidth() / 2;
	}
	
	public static void printCount() {
		System.out.println("현재까지 만들어진 원형의 갯수 : " + circleCount);
	}	

}
