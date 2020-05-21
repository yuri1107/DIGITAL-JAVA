package day21;

import java.time.*;
import java.util.*;

public class CashBookMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CONSUM_CATEGORY [] list = CONSUM_CATEGORY.values();
		for(int i = 0 ; i<list.length; i++)
			System.out.print(list[i] + ", ");
		
		System.out.println();
		
		printMenu();
		System.out.println("일자를 입력하세요.");
		LocalDate paymentDay = LocalDate.of(scan.nextInt(),scan.nextInt(),scan.nextInt());
		System.out.println(paymentDay);
		
		scan.close();
	} // main close

	//메뉴 프린트
	public static void printMenu() {
		System.out.println("=================");
		System.out.println("1. 등록 - 미구현");
		System.out.println("2. 수정 - 미구현");
		System.out.println("3. 확인 - 미구현");
		System.out.println("4. 종료 - 미구현");
		System.out.println("=================");
		System.out.print("메뉴를 선택하세요 : ");
	}
	

	/* 기능 : 등록 - 추가한 수입리스트 혹은 지출리스트를 가계부에 등록한다. if수입 / if지출
	  매개변수 : Scanner scan,가계부
	  리턴타입 : 등록한 정보
	  메소드명 : insertCash
	*/
	public static Class insertCash (Scanner scan, Class Money, CONSUM_CATEGORY consumCategori, INCOME_CATEGORY incomeCategori, int cash, String memo) {
		Money don = new Money();
		System.out.print("일자를 입력하세요. : ");
		LocalDate paymentDay = LocalDate.of(scan.nextInt(),scan.nextInt(),scan.nextInt());
		System.out.print("분류를 입력하세요. : ");
		String tmpcategori = scan.next();
		//입력한 임시분류가 분류에 없으면 실패
		if (!tmpcategori.equals(consumCategori) && !tmpcategori.equals(incomeCategori) || tmpcategori == null) {
			System.out.println("잘못된 분류입니다.");
			return null;
		}
		if (tmpcategori.equals(consumCategori)) {
			//지출분류
			System.out.println("지출금액을 입력하세요. : ");
			cash = scan.nextInt();
			
			System.out.println("지출내용을 입력하세요. : ");
			memo = scan.next();
			don.consum.add(paymentDay,tmpcategori,cash,memo);
		}
		if (tmpcategori.equals(incomeCategori)) {
			//수입분류
			System.out.println("수입금액을 입력하세요. : ");
			cash = scan.nextInt();
			System.out.println("수입내용을 입력하세요. : ");
			memo = scan.next();
			don.income.add(cash,memo);
		}
		
		
		return null;
	}
	
	/* 기능 : 정보수정 - 등록된 리스트중에 수정할 내용을 검색, 선택하고 수정하는것 
	  매개변수 : 
	  리턴타입 : 
	  메소드명 : 
	*/
	
	/* 기능 : 확인 - 원하는 필터별로 목록을 출력
	  매개변수 : 
	  리턴타입 : 
	  메소드명 : 
	*/

	
} //CashBookMain class close

enum CONSUM_CATEGORY {
	식비, 교통비, 월세, 전기요금, 가스요금, 문화생활, 식재료, 저축, 통신비, 생활용품, 건강의료, 사회생활;
}
enum INCOME_CATEGORY {
	월급, 보너스, 용돈, 선물, 재난지원금
}

class Money {
	LocalDate paymentDay; //일시 (YYYY-MM-DD) scan
	String memo; // 내용 nextLine
	CONSUM_CATEGORY consumCategori; //카테고리
	INCOME_CATEGORY incomeCategori;
	int cash; //금액 (지출의경우 - 기호를 붙이고 입력하면 글자 바꾸는 함수로 공백으로 바꾸고 계산)
	
	List<String> income = new ArrayList<String>(); //수입
	List<String> consum = new ArrayList<String>(); //지출
	
	public Money () {} 
	public Money(LocalDate paymentDay, String memo, int cash, List<String> income, List<String> consum) {
		super();
		this.paymentDay = paymentDay;
		this.memo = memo;
		this.cash = cash;
		this.income = income;
		this.consum = consum;
	}
	
	
}