import java.util.Scanner;
public class Lab12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("����>>");
		double a = s.nextDouble();
		String str = s.next();
		double b = s.nextDouble();
		double sum;
		s.close();
		if(str.equals("+")) {
			sum = a + b;
			System.out.println(a + str + b + "�� ��� ����� " + sum);
		}
		else if(str.equals("-")) {
				sum = a - b;
			System.out.println(a + str + b + "�� ��� ����� " + sum);
		}
		else if(str.equals("*")) 
			System.out.println(a + str + b + "�� ��� ����� " + a*b);
		else {
			if(b == 0)
				System.out.println("0���� ���� �� �����ϴ�.");
			else
			System.out.println(a + str + b + "�� ��� ����� " + a/b);
		}

	}

}
