import java.util.Scanner;
public class Chapter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("���������� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
		System.out.print("ö�� >> ");
		String chulsu = s.next();
		System.out.print("���� >> ");
		String younghee = s.next();
		s.close();
		
		if(chulsu.equals(younghee)) 
			System.out.println("�����ϴ�.");
		else if(chulsu.equals("����")) {
			if(younghee.equals("����"))
				System.out.println("���� �̰���ϴ�.");
			else
				System.out.println("ö���� �̰���ϴ�.");
		}
		else if(chulsu.equals("����")) {
			if(younghee.equals("��"))
				System.out.println("���� �̰���ϴ�.");
			else
				System.out.println("ö���� �̰���ϴ�.");
		}
		else {
			if(younghee.equals("����"))
				System.out.println("���� �̰���ϴ�.");
			else
				System.out.println("ö���� �̰���ϴ�.");
		}

	}

}
