import java.util.Scanner;

public class Lab1_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �߽� x1, y1, ������ radius1 >>");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int radius1 = scanner.nextInt();
		
		System.out.print("���� �߽� x2, y2, ������ radius2 >>");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		int radius2 = scanner.nextInt();
		
		scanner.close();
		
		double distance = Math.sqrt(Math.pow(x2 - x1, 2)+Math.pow(y2 - y1, 2));
		
		if((radius1 + radius2) == distance || (radius1 + radius2) < distance)
			System.out.println("�� ���� ���� ��ġ�� �ʴ´�.");
		else
			System.out.println("�� ���� ���� ��ģ��.");
	}

}
