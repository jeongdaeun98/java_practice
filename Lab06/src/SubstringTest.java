import java.util.Scanner;
public class SubstringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int i;
		String a,b;
		System.out.println("���ڿ��� �Է��ϼ���. ��ĭ�̳� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�.");
		String str = s.nextLine();
		for(i = 1; i <= str.length(); i++) {
			a = str.substring(i);
			b = str.substring(0,i);
			System.out.println(a + b);
		}
		s.close();

	}

}
