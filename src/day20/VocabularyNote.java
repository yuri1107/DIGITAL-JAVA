package day20;

import java.util.*;

public class VocabularyNote {
	/* 영어 단어장 프로그램을 작성하세요.
	 * 1. 영어 단어 등록 - 등록하려는 단어(키)가 있는경우 뜻(값)을 추가하는지 물어보고 ㅇ하면 값을 추가
	 * 2. 영어 단어 수정 - get key , 삭제하고 다시등록하게하기
	 * 3. 영어 단어 삭제 - remove ??맞나 모르것넹
	 * 4. 영어 단어 검색 - 검색을할때 한글로 검색을하면 값에서 검색을하고 영어로 검색하면 검색한 영어를 포함하는 키를검색
	 * 5. 종료
	 *
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList <Vocabulary> values = new ArrayList();  //단어 + 품사+뜻 리스트
				
		Vocabulary v = new Vocabulary(); //단어 객체 v
		
		int menu = 0;
		
		do {
			printMenu();
			menu = scan.nextInt();
			switch (menu) {
			case 1 : 
				System.out.println("영어 단어를 등록합니다.");
				v = inputVocabulary(scan);
				if (!insertVocabulary(v, values)) {
					System.out.println("이미 있는 단어 정보입니다.");
				}else {System.out.println("단어를 성공적으로 추가했습니다.");}
				break;
			case 2 :
				System.out.println("수정할 단어 정보를 입력하세요.");
				v = inputVocabulary(scan);
				int res = modifyVocabulary(v, values);
				if(res == -2) {System.out.println("존재하지 않는 단어입니다.");}
				else if (res == -1) {System.out.println("이미 있는 단어 입니다.");}
				else if (res == 0) {System.out.println("단어가 추가되었습니다");}
				else {System.out.println("단어의 정보를 수정했습니다.");}
				break;
			case 3 :
				System.out.println("삭제할 단어를 입력하세요.");
				v = inputVocabulary(scan);
				if(!deleteVocabulary(v, values)) {System.out.println("없는 단어 입니다.");}
				else {System.out.println("단어를 삭제했습니다.");}
				break;
			case 4 :
				System.out.println("검색할 단어를 입력하세요.");
				String search;
				while((search = scan.nextLine()).trim().length() == 0);
				v.words = search;
				if (values.contains(v)) {
					System.out.println(searchVocabulary(v, values));
				}
				
				break;
			case 5 :
				System.out.println("프로그램을 종료합니다.");
				break;
			default : System.out.println("올바른 메뉴가 아닙니다.");
			}
		}while (menu != 5);
		
		scan.close();
	}
	
	//메뉴 출력 메소드  #완
	//추가하고싶은것 : --으로 구분 안해도 가운데로 정렬하고 자간 맞추기
	private static void printMenu () {
		System.out.println("---------영어단어장 메뉴---------");
		System.out.println("1. 영어 단어 등록");
		System.out.println("2. 영어 단어 수정");
		System.out.println("3. 영어 단어 삭제");
		System.out.println("4. 영어 단어 검색");
		System.out.println("5. 프로그램  종료");
		System.out.println("----------------------------");
		System.out.println("메뉴 번호를 입력하세요 : ");
	}

	//단어 입력 메소드 #완
	public static Vocabulary inputVocabulary (Scanner scan) {
		Vocabulary v = new Vocabulary();
		String tmp = "";
		System.out.println("단어는 무엇인가요 ?");
		v.words = (scan.next());
		do {
			System.out.println("단어의 뜻을 입력하세요.");
			while((tmp = scan.nextLine()).trim().length() == 0);
			if (tmp.trim().equals("no")) {break;}
			v.sense.add(tmp);
		}while (true);
		return v;
	}
	//단어 등록 메소드
	public static boolean insertVocabulary (Vocabulary v, ArrayList <Vocabulary> values) {
		//실패하는경우들
		//단어장이 없는 경우 #완 
		if (values == null || v == null) return false;
		int cnt = 0;
		if (values.contains(v)) { //단어장에 (단어+뜻)이 있는경우
			for (int i = 0; i < values.size(); i++) {
				if (values.get(i).equals(v)) { //단어장의 목록을 쭉 훑어서 (단어+뜻)과 일치하는게 있는경우
					for(int j = 0; j < v.sense.size(); j++) {
						//단어장의 목록i번지에 있는 뜻이 객체(지금만든v)의 뜻 번지j에 있는 뜻과 같은 경우
						if (values.get(i).sense.contains(v.sense.get(j))) {
							System.out.println("이미 등록된 해설 입니다.");
						}else {
							values.get(i).sense.add(v.sense.get(j));
							cnt++;
						}
					}
				}
			}
			if (cnt == 0) return false;
			else {
				System.out.println(cnt + "개의 해설이 추가되었습니다.");
				return true;
			}
		}else {
			values.add(v); //단어장에 단어 추가
			return true;
		}
	}
	
	//단어 수정 메소드
	public static int modifyVocabulary (Vocabulary v, ArrayList <Vocabulary> values) {
		//실패하는 경우들
		//단어장이 없는경우
		int cnt = 0;
		if (values == null || v == null) return -2;
		if (values.contains(v)) { //단어장에 (단어+뜻)이 있는경우
			for (int i = 0; i < values.size(); i++) {
				if (values.get(i).equals(v)) { //단어장의 목록을 쭉 훑어서 (단어+뜻)과 일치하는게 있는경우
					for(int j = 0; j < v.sense.size(); j++) {
						//단어장의 목록i번지에 있는 뜻이 객체(지금만든v)의 뜻 번지j에 있는 뜻과 같은 경우
						if (values.get(i).sense.contains(v.sense.get(j))) {
							//System.out.println("수정하려는 해설과 동일한 해설입니다.");
						}else {
							values.get(i).sense.remove(v.sense.get(j));
							values.get(i).sense.add(v.sense.get(j));
							cnt ++;
							//근데 이렇게하면 해설만 수정하는게 되는데 단어는 수정하려면 어캐해야하지 => 삭제하고 다시 추가하라그래
						}
					}
				}
			}
			
		}else {
			values.add(v); //수정하려는 단어가 없으면 단어장에 단어 추가
			return 0; //수정아니고 추가된경우
			
		}
		if (cnt == 0) return -1; //수정이 한번도 안된경우
		else return 1; //해설이나 품사가 바뀐 경우
	}
	//단어 삭제 메소드
	public static boolean deleteVocabulary (Vocabulary v, ArrayList <Vocabulary> values) {
		//실패하는 경우들
		//단어장이 없는경우
		if (values == null || v == null) return false;
		if (values.contains(v)) { //단어장에 (단어+뜻)이 있는경우
			values.remove(v);
			return true;
		}
		return false; //삭제하기를 원하는 단어가 단어장에 없는경우
	}	
	
	//단어 검색 메소드
	public static Vocabulary searchVocabulary (Vocabulary v, ArrayList <Vocabulary> values) {
		//스캔을 위에서 받아서 검색
		if (values == null || v == null) System.out.println("검색을 위해 탐색할 데이터가 없습니다.");
		if (!values.contains(v)) {
			System.out.println("일치하는 단어가 없습니다.");
			return null;
		}
		for (int i = 0; i < values.size(); i++) {
			if (values.get(i).equals(v)) return values.get(i);
		}
		return null;
	}
} //public class close

//단어 클래스
class Vocabulary {
	String words; //단어
	List <String> sense = new ArrayList<String>(); //품사 + 뜻들
	
	public Vocabulary() {} //기본생성자
	//생성자 오버로딩
	public Vocabulary(String words, List<String> sense) {
		super();
		this.words = words;
		this.sense = sense;
	}
	//문자열로 toString
	@Override
	public String toString() {
		String str = "단어 : " + words + ", 뜻 : ";
		for (int i = 0; i<sense.size(); i++) {
			str += sense.get(i) + (i == sense.size()-1 ? "":", ");
		}
		return str;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((words == null) ? 0 : words.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vocabulary other = (Vocabulary) obj;
		if (words == null) {
			if (other.words != null)
				return false;
		} else if (!words.equals(other.words))
			return false;
		return true;
	}
}
