import java.util.Scanner;
public class Lab11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("���� �Է��ϼ���(1~12)>>");
		Scanner s = new Scanner(System.in);
		int month = s.nextInt();
		s.close();
		if(month == 3 || month == 4 || month == 5)
			System.out.print("��");
		else if(month == 6 || month == 7 || month == 8)
			System.out.print("����");
		else if(month == 9 || month == 10 || month == 11)
			System.out.print("����");
		else if(month == 1 || month == 2 || month == 12)
			System.out.print("�ܿ�");
		else
			System.out.print("�߸��Է�");


		

	}

}
