import java.util.Scanner;
public class Lab10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("ù��° ���� �߽ɰ� ������ �Է�>>");
		int x1 = s.nextInt();
		int y1 = s.nextInt();
		int r1 = s.nextInt();
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>>");
		int x2 = s.nextInt();
		int y2 = s.nextInt();
		int r2 = s.nextInt();
		s.close();
		double distance = Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
		if(r1 + r2 < distance)
			System.out.print("�ο��� ���� ��ġ�� �ʴ´�.");
		else
			System.out.print("�ο��� ���� ��ģ��.");

	}

}
