import java.util.Scanner;
public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("정수 3개 입력>>");
		int num[] = new int[3];
		int i, min, max;
		for(i = 0; i < num.length; i++) {
			num[i] = s.nextInt();
		}
		s.close();
		max = num[0];
		min = num[0];
		for(i = 0; i < num.length; i++) {
			if(num[i] > max)
				max = num[i];
		}
		for(i = 0; i < num.length; i++) {
			if(num[i] < min)
				min = num[i];
		}
		for(i = 0; i < num.length; i++) {
			if(num[i] != max && num[i] != min)
				System.out.print("중간 값은 " + num[i]);
		}

	}

}
