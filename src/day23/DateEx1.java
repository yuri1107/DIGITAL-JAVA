package day23;

import java.util.*;

public class DateEx1 {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.set(2020, 9, 8);
		//달은 0~11 까지 입력하기 때문에 5월을 입력하려면 4로 입력하거나 Calender.MAY 로 입력.
		//Calender.MAY는 상수 4를 의미.
		/*
		System.out.println(date.get(Calendar.YEAR) + "-" + 
					(date.get(Calendar.MONTH) < 9 ? "0" : "") + (date.get(Calendar.MONTH)+1) + "-" + 
					(date.get(Calendar.DATE) < 10 ? "0" : "") + date.get(Calendar.DATE));
		*/
		System.out.println(toString(date));
		date.add(Calendar.DATE, -14);
		System.out.println(toString(date));
		date.add(Calendar.DATE, 14);
		System.out.println(toString(date));

		date.add(Calendar.MONTH, 1);
		System.out.println(toString(date));
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "-" + 
				(date.get(Calendar.MONTH) < 9 ? "0" : "") + (date.get(Calendar.MONTH)+1) + "-" + 
				(date.get(Calendar.DATE) < 10 ? "0" : "") + date.get(Calendar.DATE);
		
	}

}
