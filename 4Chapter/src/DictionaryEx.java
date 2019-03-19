import java.util.Scanner;
class Dictionary{
	String word;
	Scanner s = new Scanner(System.in);
	private static String [] kor = {"사랑", "아기", "돈", "미래", "희망"};
	private static String [] eng = {"love", "baby", "money", "future", "hope"};
	public static String kor2Eng(String word) {
		int i;
		int bool = 0;
		for(i = 0; i < kor.length; i++) {
			if(word.equals(kor[i])) {
				bool = 1;
				break;
			}
		}
		if(bool == 1)
			return eng[i];
		return word;
		
	}
	public void run() {
		System.out.println("한영 단어 검색 프로그램입니다.");
		while(true) {
			System.out.print("한글 단어?");
			word = s.next();
			if(word.equals("그만"))
				break;
			if(!word.equals(kor2Eng(word)))
				System.out.println(word + "은 " +kor2Eng(word));
			else
				System.out.println(word + "는 저의 사전에 없습니다.");
				
	}
	}
	
	
}
public class DictionaryEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dictionary d = new Dictionary();
		d.run();
		
		
	}

}
