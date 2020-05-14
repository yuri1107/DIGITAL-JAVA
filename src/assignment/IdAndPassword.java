package assignment;

import java.util.*;
//id와 pw를 등록하고, id를 이용하여 pw를 검색하는 코드를 작성하세요.
public class IdAndPassword {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> userinfo = new HashMap<String, String>();


		int menuNum = -1;
		for ( ; menuNum != 3 ; ) {
			printMenu();
			menuNum = sc.nextInt();
			
			switch (menuNum) {
		//	case 1 : userEnrollment(sc); break;
			case 2 :  break;
			case 3 : System.out.println("종료합니다."); break;
			}
			
		} 
		

	}
	public static void printMenu () {
		System.out.println("메뉴");
		System.out.println("1. 등록");
		System.out.println("2. 검색");
		System.out.println("3. 종료");
		System.out.println("메뉴를 선택하세요 : ");
	}
	
	public static HashMap<String, String> userEnrollment (Scanner sc,HashMap<String, String> userinfo) { //등록
		
		System.out.println("ID : ");
		String userid = sc.next();
		System.out.println("PW : ");
		String userpw = sc.next();
		userinfo.put(userid, userpw);
		
		return userinfo;
	}
	
	public static boolean userSearch (Scanner sc, HashMap<String, String> userinfo) { //검색
		System.out.println("ID : ");
		String wantinfo = sc.next(); //수정해야함
		
		Set set = userinfo.entrySet();
		Iterator it = set.iterator();
			Map.Entry e = (Map.Entry)it.next();
			/*
			if (등록된e.getKey == 찾으려는e.getKey) {
				System.out.println(등록된e.getKey + "의 pw는 " + e.getValue() + "입니다.");
			}else {
				System.out.println(찾으려는e.getKey + "는 없는 아이디 입니다.");
			}
			*/

			
			//boolean containsKey (Object key) - 포함해있으면 참
		return false;
	}
	

}
