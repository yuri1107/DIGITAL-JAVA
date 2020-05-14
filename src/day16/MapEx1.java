package day16;

import java.util.*;

public class MapEx1 {

	public static void main(String[] args) {
		// <> 를 쓰는것은 '제너릭클래스' 라고 한다.
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("asdf", "password");
		map.put("asdf", "password2");
		map.put("asdfd", "password");
		
		Set<Map.Entry<String, String>> set = map.entrySet();
		Iterator<Map.Entry<String, String>> it = set.iterator();
		while(it.hasNext()) { 
			Map.Entry<String, String> e = it.next();
			System.out.println("ID : " + e.getKey());
			System.out.println("PW : " + e.getValue());
			System.out.println("=======================");
		}
		Set<String> keySet = map.keySet(); //값을 중복허용하지 않기때문에 Set
		Collection<String> valuSet = map.values(); //값을 중복허용하기때문에 Collection
		//Set valuSet = map.values();

	}

}

class Entry {
	Object key;
	Object value;
}