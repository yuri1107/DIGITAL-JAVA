package day23;

import java.util.*;

public class MapTest1 {
/* 카페 등급을 프론트에서 요청을 하면 서버에서 해당 카페 등급에 맞는 카페 리스트와 카페 등급을 프론트로 보내려 한다.
 * 이때 카페 등급 : 정수 , 카페 이름 : String , 카페 리스트 : List<String> 이다.
 * 
*/
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("cafeGrade",new Integer(1)); //카페 등급이 1등급
		List<String> list = new ArrayList<String>();
		list.add("네이버 카페 1");
		list.add("네이버 카페 2");
		map.put("cafeList", list);
		
	}

}
