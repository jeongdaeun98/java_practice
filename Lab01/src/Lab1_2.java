import java.util.Scanner;
public class Lab1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5, j = i;
		do {
			j = i;
			do {
				System.out.print("*");
				j--;
			}while(j > 0);
			System.out.println("");
			i--;
		}while(i > 0);
		}
}
