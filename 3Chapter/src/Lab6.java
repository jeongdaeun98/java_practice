import java.util.Scanner;
public class Lab6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("���� ���� 10���� �Է��Ͻÿ�>>");
		int num [] = new int[10];
		int i;
		for(i = 0; i < num.length; i++) {
			num[i] = s.nextInt();
		}
		s.close();
		System.out.print("3�� ����� ");
		for(int n : num) {
			if(n % 3 == 0)
				System.out.print(n + " ");
		}

	}

}
