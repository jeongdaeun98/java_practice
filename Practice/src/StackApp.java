import java.util.Scanner;
public class StackApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("�� ���� ���� ������ ũ�� �Է� >>");
		int limit = scan.nextInt();
		boolean git = true;
		String val;
		StringStack stack = new StringStack(limit);
		while(true) {
			System.out.print("���ڿ� �Է� >> ");
			val = scan.next();
			if(val.equals("�׸�")) break;
			boolean boo = stack.push(val);
			if(!boo)
				System.out.println("������ �� ���� Ǫ�� �Ұ�!");
	}

		System.out.print("���ÿ� ����� ��� ���ڿ� �� : ");
		int len = stack.length();
		for(int i = 0; i <= len; i++) {
			System.out.print(stack.pop()+" ");
		}
}
}
