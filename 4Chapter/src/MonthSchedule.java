import java.util.Scanner;

class Day{
	private String work;
	public void set(String work) {this.work = work;}
	public String get() {return work;}
	public void show() {
		if(work == null)System.out.println("�����ϴ�.");
		else System.out.println(work + "�Դϴ�.");
	}
}

public class MonthSchedule {
	private Day d[] = new Day [30];
	Scanner s = new Scanner(System.in);
	private String work;
	private int day,i;
	
	private MonthSchedule(int day) {
		
		for(i = 0; i < d.length; i++) {
			d[i] = new Day();
		}
		
	}
	private void input(int day) {
		System.out.print("����(��ĭ�����Է�)?");
		work = s.next();
		d[day].set(work);
		
	}
	private void view(int day) {
		System.out.print(day + "���� �� ���� ");
		d[day].show();
	}
	private void finish() {
		System.out.println("���α׷��� �����մϴ�.");
		
	}
	private void run() {
		
		System.out.println("�̹��� ������ ���� ���α׷�.");
		
		while(true) {
			System.out.print("����(�Է� : 1, ���� : 2, ������ : 3) >>");
			int num = s.nextInt();
			switch(num) {
			case 1 :
				System.out.print("��¥(1~30)?");
				day = s.nextInt();
				input(day);
				continue;
			case 2 :
				System.out.print("��¥(1~30)?");
				day = s.nextInt();
				view(day);
				continue;
			case 3 :
				finish();
				break;
			}
			break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MonthSchedule april = new MonthSchedule(30);
		april.run();
		}

	}


