import java.util.Scanner;
public class Lab6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		int num = s.nextInt();
		int a, b;
		a = num / 10;
		b = num % 10;
		s.close();
		
		if(a == 3 || a == 6 || a == 9) {
			if(b == 3 || b == 6 || b == 9 )
				System.out.print("�ڼ� ¦¦");
			else
				System.out.print("�ڼ� ¦");
		}

	}

}
