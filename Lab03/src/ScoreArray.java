import java.util.Scanner;
public class ScoreArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String course[] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int score[] = {95, 88, 76, 62, 55};
		Scanner s = new Scanner(System.in);
		int i, count;
		while(true) {
			count = 0;
			System.out.print("���� �̸�>>");
			String str = s.next();
			if(str.equals("�׸�"))
				break;
			
			for(i = 0; i < course.length; i++) {
				if(str.equals(course[i])) {
					System.out.println(str+"�� ������ " + score[i]);
					count++;
				}
			}
			if(count == 0)
				System.out.println("���� �����Դϴ�.");
			}
			
			s.close();
		}
		
	}


