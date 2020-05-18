package day18;

import java.util.*;


public class EnglishDictionary {

	public static void main(String[] args) {


	}

}
/* 3. 영어사전을 프로그램으로 만드려고 한다.
 * 이때 단어를 저장할 수 있는 클래스를 생성해보시오. (기능구현X)*/
/* 단어 클래스
 * - 단어, 품사, 뜻을 저장하는 클래스
 * */

// 나중에 요기다가 공백 지우는것두 만드로야딩 ~~

class saveWord {
	String word;
	
	//String wordClass[];
	//String meaning[];
	List <String> wordClass = new ArrayList<String>();
	List <String> meaning = new ArrayList<String>();
	//단어는 중복되면 안되기때문에 해당하는 단어와 같은지를 판별하는 equals가 필요 => 단어만 비교
	//set은 순서 유지가 안되기때문에 list로 함
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((word == null) ? 0 : word.hashCode());
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
		saveWord other = (saveWord) obj;
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
		return true;
	}

}

//사전 class
class Dic {
	//위에있는 class의 이름과 같은 이름의 list를 만들어야함 (?) <>이거 안에 있는게 이름이 아닌데 머지 시발 
	List<saveWord> list = new ArrayList<saveWord>();
	//단어 추가
	//단어 수정 =>품사수정하거나 뜻을 수정
	//단어 삭제
	//사전 출력 => 한 단어의 정보를 출력하거나 특정 단어가 들어간 단어들을 출력
}