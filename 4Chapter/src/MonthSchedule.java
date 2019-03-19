import java.util.Scanner;

class Day{
	private String work;
	public void set(String work) {this.work = work;}
	public String get() {return work;}
	public void show() {
		if(work == null)System.out.println("업습니다.");
		else System.out.println(work + "입니다.");
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
		System.out.print("할일(빈칸없이입력)?");
		work = s.next();
		d[day].set(work);
		
	}
	private void view(int day) {
		System.out.print(day + "일의 할 일은 ");
		d[day].show();
	}
	private void finish() {
		System.out.println("프로그램을 종료합니다.");
		
	}
	private void run() {
		
		System.out.println("이번달 스케쥴 관리 프로그램.");
		
		while(true) {
			System.out.print("할일(입력 : 1, 보기 : 2, 끝내기 : 3) >>");
			int num = s.nextInt();
			switch(num) {
			case 1 :
				System.out.print("날짜(1~30)?");
				day = s.nextInt();
				input(day);
				continue;
			case 2 :
				System.out.print("날짜(1~30)?");
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


