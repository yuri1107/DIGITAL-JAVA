package day14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestEx2 {
	public static void main(String[] args) {
		String registerNum;
		Scanner scan = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요 : ");
		registerNum = scan.nextLine();
		
		//정규표현식 적용
		Pattern p = Pattern.compile("(\\d{6}-\\d{7})|(\\d{13})");
		Matcher m = p.matcher(registerNum); //
		if(!m.matches()) { //if (! p.matcher(registerNum).matches()) 와 같은 조건문
			System.out.println("올바른 주민번호 형태가 아닙니다.");
			scan.close();
			return;
		}
		//registerNum = registerNum.replaceAll("-", "");
		//registerNum = registerNum.replaceAll(" ", "");
		//if (registerNum.length() != 13) {
		//	System.out.println("주민번호 길이가 잘못되었습니다.");
		//	scan.close();
		//	return;
		//}
		if (! isValid(registerNum.substring(0,6))) {
			System.out.println("유효하지 않은 생년월일 입니다.");
			scan.close();
			return;
		}
		char gender;
		if (registerNum.contains("-")) {
			gender = registerNum.charAt(7);
		}else {
			gender = registerNum.charAt(6);
		}
		//보완하려면 2월에 윤년, 평년 계산해야함
		switch (gender) {
		case '1' : case '3' : case '9' :
			System.out.println("해당 주민번호는 내국인 남성입니다."); break;
		case '2' : case '4' : case '0' :
			System.out.println("해당 주민번호는 내국인 여성입니다."); break;	
		case '5' : case '7' : 
			System.out.println("해당 주민번호는 외국인 남성입니다."); break;
		case '6' : case '8' : 
			System.out.println("해당 주민번호는 외국인 여성입니다."); break;
		}

	}
	public static boolean isValid (String birth) {
		if (birth == null || birth.length() != 6)  return false;
		String sYear = birth.substring(0,2); //0번지부터 2번지의'앞번지'까지 부분문자열 생성 (0~1번지)
		
		String sMonth = birth.substring(2,4); //2번지부터 4번지의'앞번지'까지 부분문자열 생성 (2~3번지)
		String sDay = birth.substring(4,6); //4번지부터 6번지의'앞번지'까지 부분문자열 생성 (4~5번지)
		int year, day, month;
		
		try {
			year = Integer.parseInt(sYear);
			month = Integer.parseInt(sMonth);
			day = Integer.parseInt(sDay);
		}catch(Exception e) {
			return false;
		}
		
		//int year = Integer.parseInt(sYear);
		//int month = Integer.parseInt(sMonth);
		//int day = Integer.parseInt(sDay);
		int lastDay = 31;
		//if (month < 1 || month > 12) return false; //리턴값이 거짓이기때문에
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			lastDay = 31; break;
		case 4: case 6: case 9: case 11:
			lastDay = 30; break;
		case 2: 
			lastDay = 28; break;
		default : return false;
		}
		if (day < 1 || day > lastDay) return false;
		return true;		
		
	}

}
