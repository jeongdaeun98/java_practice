import java.util.Scanner;
public class Lab7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("점 (x,y)의 좌표를 입력하시오>>");
		int x = s.nextInt();
		int y = s.nextInt();
		s.close();
		if(x >= 100 && x <= 200 && y >= 100 && y <= 200)
			System.out.print("(" + x + "," + y +")" + "는 사각형 안에 있습니다.");
		else
			System.out.print("(" + x + "," + y +")" + "는 사각형 안에 없습니다.");
			
	}

}
