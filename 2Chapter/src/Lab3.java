import java.util.Arrays;
import java.util.Scanner;
public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		int num = s.nextInt();
		int one[] = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		int gwon[] = new int[8];
		String st[] = {"��������", "������", "õ����","�����","���", "���ʿ�", "�ʿ�", "�Ͽ�"};
		int i;
		Arrays.fill(gwon, 0);
		s.close();
		for(i = 0; i < one.length; i++) {
			gwon[i] = num / one[i];
			num = num - gwon[i]*one[i];
		}
		for(i = 0; i < gwon.length; i++) {
			if(gwon[i] != 0 && i <= 2)
				System.out.println( st[i] +" " + gwon[i] +"��");
			else if(gwon[i] != 0)
				System.out.println( st[i] +" " + gwon[i] +"��");
		}
		

	}

}
