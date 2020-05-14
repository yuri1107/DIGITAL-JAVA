package day16;

import java.util.*;

public class MapTestEx1 {
//200514_자습예제 - id와 pw를 등록하고, id를 이용하여 pw를 검색하는 코드를 작성하세요.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/* Map 인터페이스를 이용하여 객체를 만들수는 없지만 (new를 통해서)
		 * Map 인터페이스를 구현한 HashMap을 이용하여 객체를 만들어서
		 * Map 인터페이스의 객체에 저장할 수 있다.
		 * */
		Map<String, String> map = new HashMap <String, String> ();
		
		
		int menu = 4;
		do {
			inputMenu();
			menu = scan.nextInt();
			switch (menu) {
			case 1 : 
				inputInfo(scan, map); //scan을 통해 정보를 입력받고 맵에 추가하는 작업
				break;
			case 2 : 
				searchInfo(scan, map);
				break;
			case 3 : 
				modifyInfo(scan, map);
				break;
			case 4 : System.out.println("종료합니다."); break;
			default : System.out.println("잘못된 메뉴입니다.");
			}
		}while (menu != 4);
	} // main close

	public static void inputMenu() {
		System.out.println("---메뉴---");
		System.out.println("1. 등록");
		System.out.println("2. 검색");
		System.out.println("3. 수정");
		System.out.println("4. 종료");
		System.out.println("----------");
		System.out.print("메뉴를 선택하세요 : ");
	}
	
	/* 기능 : 스캐너를 이용하여 아이디와 패스워드를 입력받아 맵에 저장하는 메소드
	 * 매개변수 : 스캐너, map => Scanner scan, Map<String, String> map 맵은 이렇게 걍 맵으로 하는게 트리맵도 해시맵도 쓸수잇음
	 * 리턴타입 : 없음 ㅋ 근데 맵으로 해도 되긴하는데 매개변수로 맵 쓰니까 ㅋ.. => void
	 * 메소드명 : inputInfo
	 * */
	public static void inputInfo (Scanner scan, Map<String, String> map) {
		System.out.print("ID : ");
		String id = scan.next();
		System.out.print("PW : ");
		String pw = scan.next();
		map.put(id,pw);
	}
	
	/* 기능 : 스캐너를 이용하여 아이디를 입력받아 맵에 해당 아이디와 일치하는 아이디가 있는지 확인하여
	 * 있으면 아이디와 비밀번호를 출력하고, 없으면 없다고 출력하는 메소드
	 * TMI : 스캐너를 이용한다고 쓰는것보단 안쓰는게 나은데 혹시 삽질할까봐 스캐너를 이용하여  라는 말이 붙음
	 * 매개변수 : scan, map => Scanner scan, Map<String, String> map
	 * 리턴타입 : void
	 * 메소드명 : searchInfo
	 * */
	public static void searchInfo(Scanner scan, Map<String, String> map) {
		System.out.print("ID : ");
		String id = scan.next();
		String pw = map.get(id); //id랑 일치하는 id가 있으면 비밀번호를 가져옴
		if (pw == null) {
			System.out.println(id + "는 없는 아이디 입니다.");
		}else {
			System.out.println(id + "의 비밀번호는 " + pw + "입니다.");
		}
	}
	/*
	public static void modifyInfo (Scanner scan, Map<String, String> map) {
		//searchInfo(scan, map);
		System.out.print("ID : ");
		String id = scan.next();

		System.out.print("PW(now) : ");
		String oldpw = scan.next();
		
		if (pw == oldpw) {
			System.out.println("바꿀거 입력");
			String newpw = scan.next();
			boolean replace(Object key, Object oldvalue, Object newValue)
			
		}
		
		
		
		//boolean replace(Object key, Object oldvalue, Object newValue) -> 지정된 키와 객체가 모두 일치하는 경우에만 새로운 객체로 대체
		String pw = map.get(id); 
	}
	*/
	
	
	/* 기능 : 스캐너를 이용하여 아이디를 입력받고 맵에서 아이디와 일치하는 정보가 있으면 비밀번호를 입력받고 수정하는 메소드
	 * 매개변수 : 스캐너, 맵 => Scanner scan, Map<String, String> map
	 * 리턴타입 : void
	 * 메소드명 : modifyInfo
	 * */
	
	public static void modifyInfo (Scanner scan, Map<String, String> map) {
		System.out.print("ID : ");
		String id = scan.next();
		String pw = map.get(id);
		if (pw == null) {
			System.out.println(id + "는 없는 ID 입니다.");
			return ;
		}
		System.out.println("PW(now) : ");
		String ipw = scan.next();
		System.out.println("PW(new) : ");
		String inewpw = scan.next();
		if (!pw.contentEquals(ipw)) {
			System.out.print("비밀번호 수정에 실패했습니다.");
		}else {
			map.replace(id, inewpw);
			System.out.print("비밀번호가 수정되었습니다.");
		}
		
	}
	
} //class MapTestEx1 close;