package day9;

public class Shape {

	private int left; // 시작점의 x좌표
	private int up; // 시작점의 y좌표
	private double width; //가로길이
	private double height; //세로길이
	
	private static int count; //지금까지 생성한 도형의 갯수를 출력
	
	
	public static void printCount() {
		System.out.printf("현재까지 만들어진 도형의 갯수 : %d 개 \n",count);
	}
	
	//private int left,up; //이렇게 하는거 가능 private int 가 left와 up에 공통으로 적용
	
	public void print() { //도형의 정보 출력
		System.out.println("----------도형의 정보----------");
		System.out.printf("시작점은 (%d,%d) \n", left, up);
		System.out.printf("가로 : %.2f \n",width);
		System.out.printf("세로 : %.2f \n",height);
		//System.out.printf("생성된 도형 갯수 : %d 개",++count); 여기아님 ㅋ
		System.out.println("----------------------------");
	}
	
	
	
	public Shape() { count++; }
	
	//다른생성자 하려면 우클릭 소스 제너레이트 유진필드
	public Shape(int left, int up, double width, double height) {
		this.left = left;
		this.up = up;
		this.width = width;
		this.height = height;
		count++;
	}
	public void move(int left, int up) { //시작점 좌표 변경,왼쪽 윗점만 바꾸면 됨 (사이즈변경 ㄴㄴ)
		this.left = left;
		this.up = up;
		
		//이렇게 하면 안될까요
		//this.left = left; this.up = up; //이렇게 하는거 가능
	}
	
	public void resize (double width, double height) { //도형의 사이즈 조절
		this.width = width;
		this.height = height;
	}
	
	
	//위쪽에 메서드를 작성하고 겟셋을 아래에 놓는걸 권장 (코드 보기 편하니까)
	//겟셋 시작
	public int getLeft() {
		return left;
	}
	public void setLeft(int left) {
		this.left = left;
	}
	public int getUp() {
		return up;
	}
	public void setUp(int up) {
		this.up = up;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	//겟셋 끝
	
	

}
