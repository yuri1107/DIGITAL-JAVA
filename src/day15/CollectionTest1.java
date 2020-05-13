package day15;

import java.util.*;

public class CollectionTest1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		while (true) {
			System.out.println("오늘의 할일을 추가하시겠습니까?(y/n) : ");
			char menu = scan.next().charAt(0);
			
			scan.nextLine();
			if (menu == 'y' || menu == 'Y') {
				System.out.println("오늘의 할일을 입력하세요 : ");
				String toDo = scan.nextLine();
				list.add(toDo);
			}else if(menu == 'n' || menu == 'N') {
				System.out.println("To Do List");
				for (int i = 0; i<list.size(); i++) {
					System.out.println(i+1 + ". "+ list.get(i));
				}
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
		scan.close();
	}

}
