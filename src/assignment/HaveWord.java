package assignment;

import java.util.Scanner;

public class HaveWord {

	public static void main(String[] args) {
		/* 제목을 입력하고 단어를 입력 후 해당 단어가 제목에 있는지 확인하는 코드를 작성하세요.
		 *
		*/
		Scanner scan = new Scanner(System.in);
		
		String title = null;
		String word = null;
		
		while (true) {
			
			System.out.println("제목을 입력하세요 종료는 h : ");
			title = scan.nextLine();
			//title.trim().toLowerCase().equals("h")에서 trim이랑 toLowerCase는 순서가 바껴도 상관없다.
			//title.trim().equals("h") || title.trim().equals("H")의 고급스러운 표현은 아래 if문의 조건과 같다.
			if (title.trim().toLowerCase().equals("h")) {
				break;
			}
			if (title != null) {
				System.out.println("단어를 입력하세요 : ");
				word = scan.next();
				if (title.contains(word)) {
					System.out.println(title + "에는 " + word + "라는 단어가 있습니다.");
					
				}else {	
					System.out.println(title + "에는 " + word + "라는 단어가 없습니다.");
				}
			}
			scan.nextLine(); // title에는 nextLine이라서 엔터까지 포함되기때문에 두번째부터는 제목,단어 같이 실행된다.
			//그거를 방지하기 위해서 엔터를 한번 먹어주는 scan.nextLine();을 한번 더 선언한것.
			
			
		}
	scan.close();
	}
	
}
