import java.util.Scanner;
public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
		String str = s.next();
		s.close();
		char c = str.charAt(0);
		for(char k = c; k >= 'a'; k--) {
			for(char t = 'a'; t <= k; t++) {
				System.out.print(t);
			}
			System.out.println(" ");
		}

	}

}
