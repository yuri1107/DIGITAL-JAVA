package day19;

import java.util.*;

public class TestEx3 {
	/* 아래 Student 클래스를 이용하여 학생관리 프로그램을 만들려고 한다.
	 * 기능은 학생 정보 추가, 학생 정보 수정, 학생정보 삭제가 있다.
	 * 이때 필요한 메소드를 선언부만 정의하시오.
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List <Student> list = new ArrayList<Student> (); //List 생성

		//추가 수정 삭제 메소드를 이용하여 메인에서 학생관리프로그램이 동작하도록 코드를 구성하세요
		Student s;
		int menu = 0;
		
		do {
			printMenu();
			menu = scan.nextInt();
			switch(menu) {
			case 1 : 
				System.out.println("추가할 학생 정보를 입력하세요.");
				s = inputStudent(scan);
				if (!insertStudent(list, s)) {
					System.out.println("이미 있는 학생 정보입니다.");
				}else {System.out.println("학생정보를 추가했습니다.");}
				break;
			case 2 : 
				System.out.println("수정할 학생 정보를 입력하세요.");
				s = inputStudent(scan);
				if(!modifyStudent(list, s)) {System.out.println("없는 학생정보입니다.");}
				else {System.out.println("학생정보를 수정했습니다.");}
				break;
			case 3 : 
				System.out.println("삭제할 학생 정보를 입력하세요.");
				s = inputStudent(scan);
				if(!deleteStudent(list, s)) {System.out.println("없는 학생정보입니다.");}
				else {System.out.println("학생정보를 삭제했습니다.");}
				break;
			case 4 : 
				printStudent(list);
				break;
			case 5 : 
				System.out.println("프로그램을 종료합니다.");
				break;
			default: System.out.println("올바른 메뉴가 아닙니다.");
			}
		}while (menu != 5);
		
		
		scan.close();
	}
	
	private static void printMenu() {
		System.out.println("---------menu---------");
		System.out.println("1. 학생정보 추가");
		System.out.println("2. 학생정보 수정");
		System.out.println("3. 학생정보 삭제");
		System.out.println("4. 학생정보 출력");
		System.out.println("5. 프로그램 종료");
		System.out.println("----------------------");
		System.out.println("메뉴 번호를 입력하세요 : ");
	}
	
	public static void printStudent (List<Student> list) {
		if (list == null || list.size() == 0) {System.out.println("출력할 학생 정보가 없습니다.");}
		else {
			System.out.println("-----------------------------------");
			for(Student tmp : list) {
				System.out.println(tmp);
			}
		}
	}
	
	/* 기능 : 스캐너를 이용하여 학생정정보를 입력하면 학생객체를 반환하는 메소드
	 * 매개변수 : 스캐너 스캔
	 * 리턴타입 : 학생객체 => Student
	 * 메소드명 : inputStudent
	 * */	
	public static Student inputStudent (Scanner scan) {
		Student s = new Student();

		System.out.print("학번 을 입력하세요. : ");
		s.num = (scan.next());	
		System.out.print("학년 을 입력하세요. : ");
		s.grade = (scan.next());
		System.out.print("이름 을 입력하세요. : ");
		s.name = (scan.next());
		System.out.print("전공 을 입력하세요. : ");
		s.major = (scan.next());
		
		return s;
	}

	
	/* 기능 : 주어진 학생정보를 학생정보리스트에 저장하는 메소드로 이미 있는 학생이면 저장하지 않고 검색결과에 없는 학생이면 저장
	 * 매개변수 : 학생정보리스트, 주어진 학생정보  => List<Student> list, Student s
	 * 리턴타입 : 저장여부 => boolean
	 * 메소드명 : insertStudent
	 * */
	public static boolean insertStudent (List <Student> list, Student s) {
		//혼자한거
		/*
		if (!list.contains(s)) {
			list.add(s);
			System.out.println("저장되었습니다.");
			return true;
		} else {
			System.out.println("이미 있는 학생입니다.");
			return false;
		}
		*/
		//학생정보 리스트가 없거나 학생정보가 없으면 추가할 수 없기 때문에 실패
		if (list == null || s == null) return false;
		//이미 있는 학생인 경우 학생정보 리스트에 추가하지 못하기 때문에 실패
		if (list.contains(s)) return false;
		//학생정보 추가
		list.add(s);
		return true;
		
	}
	
	/* 기능 : 주어진 학생정보를 학생정보리스트에서 수정하는 메소드로 
	 * 		학생정보가 없으면 수정실패를, 학생정보가 있으면 수정 성공을 알려주는 메소드.
	 * 매개변수 : 학생정보리스트, 주어진 학생정보 => List<Student> list, Student s
	 * 리턴타입 : 수정여부 => boolean
	 * 메소드명 : modifyStudent
	 * */
	public static boolean modifyStudent (List<Student> list, Student s) {
		/*
		 * 혼자한거
		//학생정보 리스트가 없거나 학생정보가 없으면 수정할 수 없기 때문에 실패
		if (list == null || s == null) return false;
		//이미 있는 학생인 경우 학생정보 리스트에서 꺼내와서 수정
		if (list.contains(s)) { //list에 s가 있으면
			list.remove(s);
			list.add(s);
			return true;
		}
		return true;
		*/
		
		//쌤따라한거에 살붙인거
		
		//list가 비거나 s가 비어있으면 거짓
		if (list == null || s == null) return false;
		//list에 학생정보 s가 있는지 확인하여 없으면 참 + 추가
		if(!list.contains(s)) {
			list.add(s); 
			return true;
		}
		//있으면 list에 있는 학생 s의 정보를 지우고, list에 학생 s의 정보를 추가
		list.remove(s);
		list.add(s);
		return true;
	}
	
	/* 기능 : 주어진 학생정보를 학생정보리스트에서 삭제하는 메소드로  
	 * 		학생정보가 없으면 삭제실패를, 학생정보가 있으면 삭제 성공을 알려주는 메소드.
	 * 매개변수 : 학생정보리스트, 주어진 학생정보 => List<Student> list, Student s
	 * 리턴타입 : 수정여부 => boolean
	 * 메소드명 : deleteStudent
	 * */	
	public static boolean deleteStudent (List<Student> list, Student s) {		
		if (list == null || s == null) return false;
		if(!list.contains(s)) return false;
		list.remove(s);
		return true;
	}

}


class Student {
	String name; //이름
	String num; //학번 => 고유번호
	String major; //전공
	String grade; //학년

	public Student() {} //기본생성자
	
	//생성자 오버로딩
	public Student(String name, String num, String major, String grade) {
		super();
		this.name = name;
		this.num = num;
		this.major = major;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "학생정보 = 이름 : " + name + ", 학번 : " + num + ", 전공 : " + major + ", 학년 : " + grade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((num == null) ? 0 : num.hashCode());
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
		Student other = (Student) obj;
		if (num == null) {
			if (other.num != null)
				return false;
		} else if (!num.equals(other.num))
			return false;
		return true;
	}

}