import java.util.Scanner;
public class Lab8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("�� (x1, y1), (x2, y2)�� ��ǥ�� �Է��Ͻÿ�>>");
		int x1 = s.nextInt();
		int y1 = s.nextInt();
		int x2 = s.nextInt();
		int y2 = s.nextInt();
		s.close();
		
		if(x1 <= 200 && y1 <= 200 && x2 >= 100 && y2 >= 100)
			System.out.println("�浹�մϴ�.");
		else
			System.out.println("�浹���� �ʽ��ϴ�.");
		

	}

}
