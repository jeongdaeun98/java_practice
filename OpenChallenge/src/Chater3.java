import java.util.Scanner;
import java.util.Random;
public class Chater3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("���� �����Ͽ����ϴ�. ���߾� ������");
		System.out.println("0-99");
		Random r = new Random();
		int num;
		int i = 1;
		int k = r.nextInt(100);
		int max = 99; int min = 0;
		
		while(true) {
			System.out.print(i + ">>");
			num = s.nextInt();
			if(k > num) {
				System.out.println("�� ����");
				min = num;
				i++;
				System.out.println(min + "-" + max);
			}
			else if(k < num) {
				System.out.print("�� ����");
				max = num;
				i++;
				System.out.println(min + "-" + max);
			}
			if(k == num) { 
				System.out.println("�¾ҽ��ϴ�.");
				System.out.print("�ٽ��Ͻðڽ��ϱ�(y/n)>>");
				String str = s.next();
				if(str.equals("y")) {
					k = r.nextInt(100);
					System.out.println("���� �����Ͽ����ϴ�. ���߾� ������");
					System.out.println("0-99");
					max = 99;
					min = 0;
					i = 0;
					continue;
				}
				else {
					s.close();
					break;
				}
			}
			
		}

	}

}
