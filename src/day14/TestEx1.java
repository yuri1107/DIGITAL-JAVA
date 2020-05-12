package day14;

import java.util.Scanner;

public class TestEx1 {
/*
문1) 제목을 입력하고 단어를 입력 후 해당 단어가 제목에 있는지 확인하는 코드를 작성하세요.

예1)
제목을 입력하세요 : Java의 정석
단어를 입력하세요 : java
Java의 정석에는 java라는 단어가 없습니다.

예2)
제목을 입력하세요 : Java의 정석
단어를 입력하세요 : Java
Java의 정석에는 Java라는 단어가 있습니다. 
*/
	public static void main(String[] args) {
		String title, word;
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("제목을 입력하세요 : ");
			title = scan.nextLine();
			if (title.contentEquals("exit")) {
				System.out.println("시스템 종료함");
				break;
			}
			System.out.print("단어를 입력하세요 : ");
			word = scan.next();
			/*
			if (!title.contains(word)) {
				System.out.println(title + "에는 " + word + "라는 단어가 없습니다.");
			}else {
				System.out.println(title + "에는 " + word + "라는 단어가 있습니다.");
			}
			*/
			//위나 아래나 같은 결과가 나옴. 실행 방식은 조금 다름
			if (title.indexOf(word) == -1) {
				System.out.println(title + "에는 " + word + "라는 단어가 없습니다.");
			}else {
				System.out.println(title + "에는 " + word + "라는 단어가 있습니다.");
			}
			scan.nextLine();
		}
		scan.close();
	}
}
