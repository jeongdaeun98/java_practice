import java.util.Scanner;
public class GBBWithComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = {"����", "����", "��"};
		int n;

		Scanner s = new Scanner(System.in);
		System.out.println("��ǻ�Ϳ� ���������� ������ �մϴ�.");
		while(true) {
			System.out.print("���� ���� ��!>>");
			String game = s.next();
			n = (int)(Math.random()*3);
			if(game.equals("�׸�")) {
				System.out.println("������ �����մϴ�...");
				break;
			}
			else if(game.equals(str[n]))
				System.out.println("����� = " +game +", ��ǻ�� = "+str[n]+", �����ϴ�.");
			
			else if(game.equals(str[0])) {
				if(str[n].equals(str[1])) 
					System.out.println("����� = " +game +", ��ǻ�� = "+str[n]+", ��ǻ�Ͱ� �̰���ϴ�.");
				
				else if(str[n].equals(str[2]))
					System.out.println("����� = " +game +", ��ǻ�� = "+str[n]+", ����ڰ� �̰���ϴ�.");
				
			}
			else if(game.equals(str[1])) {
				if(str[n].equals(str[2]))
					System.out.println("����� = " +game +", ��ǻ�� = "+str[n]+", ��ǻ�Ͱ� �̰���ϴ�.");
				else if(str[n].equals(str[0]))
					System.out.println("����� = " +game +", ��ǻ�� = "+str[n]+", ����ڰ� �̰���ϴ�.");
			}
			else if(game.equals(str[2])) {
				if(str[n].equals(str[0]))
					System.out.println("����� = " +game +", ��ǻ�� = "+str[n]+", ��ǻ�Ͱ� �̰���ϴ�.");
				else if(str[n].equals(str[1]))
					System.out.println("����� = " +game +", ��ǻ�� = "+str[n]+", ����ڰ� �̰���ϴ�.");
			}
		}
		s.close();
	}

}
