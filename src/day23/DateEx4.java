package day23;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateEx4 {
	/* 문자열을 Date로 변환하는 코드
	*/
	public static void main(String[] args) {
		String strDate = "2020-05-25 15:24:10";
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		//Date date = format.parse(strDate); 을 쓰면 예외가 발생할 수 있기때문에 아래와 같이 try/catch문으로 작성한다.
		try {
			Date date = format.parse(strDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
