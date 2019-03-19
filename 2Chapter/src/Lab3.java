import java.util.Arrays;
import java.util.Scanner;
public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		int num = s.nextInt();
		int one[] = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		int gwon[] = new int[8];
		String st[] = {"오만원권", "만원권", "천원권","오백원","백원", "오십원", "십원", "일원"};
		int i;
		Arrays.fill(gwon, 0);
		s.close();
		for(i = 0; i < one.length; i++) {
			gwon[i] = num / one[i];
			num = num - gwon[i]*one[i];
		}
		for(i = 0; i < gwon.length; i++) {
			if(gwon[i] != 0 && i <= 2)
				System.out.println( st[i] +" " + gwon[i] +"매");
			else if(gwon[i] != 0)
				System.out.println( st[i] +" " + gwon[i] +"개");
		}
		

	}

}
