import java.util.Scanner;
public class Lab9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("원의 중심과 반지름 입력>>");
		double x1 = s.nextDouble();
		double y1 = s.nextDouble();
		double r = s.nextDouble();
		System.out.print("점 입력>>");
		double x2 = s.nextDouble();
		double y2 = s.nextDouble();
		s.close();
		double sum = (x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1);
		if(Math.sqrt(sum)< r || Math.sqrt(sum) == r)
			System.out.println("점 (" + x2 + "," + y2 + ")는 원 안에 있다.");
		else
			System.out.println("점 (" + x2 + "," + y2 + ")는 원 안에 없다.");

	}

}
