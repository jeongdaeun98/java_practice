import java.util.Scanner;
class Dictionary{
	String word;
	Scanner s = new Scanner(System.in);
	private static String [] kor = {"���", "�Ʊ�", "��", "�̷�", "���"};
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
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		while(true) {
			System.out.print("�ѱ� �ܾ�?");
			word = s.next();
			if(word.equals("�׸�"))
				break;
			if(!word.equals(kor2Eng(word)))
				System.out.println(word + "�� " +kor2Eng(word));
			else
				System.out.println(word + "�� ���� ������ �����ϴ�.");
				
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
