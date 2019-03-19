
public class Lab1_DoWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, i = 0;
		
		do {
			sum = sum + i;
			i += 2;
		}while(i < 100);

		System.out.println(sum);
	}

}
