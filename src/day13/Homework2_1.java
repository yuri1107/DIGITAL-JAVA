package day13;

import java.util.Scanner;

public class Homework2_1 {
//class를 이용해서 응용한 상품관리예제
	public static void main(String[] args) {
		int size = 50;
		Product product[] = new Product[size];
		char menu = 'y';
		Scanner scan = new Scanner(System.in);
		int cnt = 0; //현재 저장된 제품의 갯수
		//1. 반복문
		while (menu != 'n' && menu != 'N') {
			//2. 입력을 받음 (yes 또는 no)
			System.out.print("상품을 등록하겠습니까?(y/n) : ");
			menu = scan.next().charAt(0);
			if (menu == 'y' || menu == 'Y') {
				//제품을 등록
				System.out.print("상품명 : ");
				String name = scan.next();
				System.out.print("가격 : ");
				int price = scan.nextInt();
				product[cnt] = new Product(name, price);
				cnt++;
			}
		}
		int total = 0;
		//등록된 제품 리스트를 출력
		for (int i = 0; i < cnt; i++) {
			//product[i].print(i+1); // Product클래스의 멤버메소드 print를 실행 (이걸 추천. 다른 클래스파일을 만들었을때도 사용이 가능하기 때문에.)
			print(product[i], i+1);	 // print 메서드를 실행
			total += product[i].getPrice();
		} 
		//3. 입력받은 값을 통해 제품 리스트를 출력할지 제품을 등록할지를 결정
		System.out.println("총가격 : " + total + "원");
		scan.close();
		
	}
	public static void print(Product product, int num) {
		System.out.printf("%d. 상품명 : %s , 가격 : %d원 \n", num, product.getName(), product.getPrice());
	}

}
class Product{
	private String name;
	private int price;
	
	public Product() {} //기본생성자

	public Product(String name, int price) { //멤버생성자
		this.name = name;
		this.price = price;
	}
	//겟셋 시작
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	//겟셋 끝
	
	public void print() {
		System.out.printf("상품명 : %s , 가격 : %d원 \n", name, price);
	}
	public void print(int num) { // 상품 갯수를 카운트하는 메서드. (메서드 오버로딩)
		System.out.print(num + ". ");
		print();
	}
	
}