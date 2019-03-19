import java.util.Scanner;
import java.util.ArrayList;

public class Lab02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> a = new ArrayList<Character>();
		Scanner s = new Scanner(System.in);
		double sum = 0;
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
		for(int index = 0; index < 6; index++) {
			char array = s.next().charAt(0);
			a.add(array);
			if(a.get(index).equals('A'))
				sum += 4.0;
			else if(a.get(index).equals('B'))
				sum += 3.0;
			else if(a.get(index).equals('C'))
				sum += 2.0;
			else if(a.get(index).equals('D'))
				sum += 1.0;
			else if(a.get(index).equals('F'))
				sum += 0;
		}
		sum = sum/6;
		s.close();
		System.out.println(sum);

	}

}
