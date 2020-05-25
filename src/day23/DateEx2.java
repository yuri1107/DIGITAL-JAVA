package day23;

import java.text.SimpleDateFormat;
import java.util.*;

public class DateEx2 {
	/* 날짜를 내가 지정한 형태의 문자열로 반환하는 코드 (p.545)
	 * 2020년 5월 25일
	 * 2020-05-25
	*/
	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy년  MM월 dd일");  //MM => 월 (날짜) mm => 분 (시간)
		System.out.println(format.format(today));
		
		format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		System.out.println(format.format(today));
		
		
		
		
	}

}
