import java.util.Scanner;
public class Lab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		Scanner s = new Scanner(System.in);
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		int [] won = new int [8];
		String one[] = {"50000�� ¥��","10000�� ¥��","1000�� ¥��","500�� ¥��","100�� ¥��","50�� ¥��","10�� ¥��","1�� ¥��"};
		int num = s.nextInt();
		s.close();
		int i;
		for( i = 0 ; i < unit.length; i++) {
			won[i] = num / unit[i];
			num = num - won[i] * unit[i];
			if(won[i] != 0)
				System.out.println(one[i] + " : " + won[i] + "��");
		}		

	}

}
