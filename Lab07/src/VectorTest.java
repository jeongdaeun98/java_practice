import java.util.Vector;
import java.util.Scanner;
public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		Scanner s = new Scanner(System.in);
		int num, max, min, i;
		System.out.print("정수(-1이 입력될 때 까지)>>");
		while(true) {
			num = s.nextInt();
			if(num == -1) break;
			v.add(num);
		}
		max = 0;
		min = 0;
		System.out.print("삭제 전 : [");
		for(i = 0; i < v.size(); i++) {
			if(v.get(max) < v.get(i))
				max = i;
			System.out.print( v.get(i));
			if(i != v.size() - 1)
				System.out.print(", ");
		}
		System.out.println("]");
		System.out.println("가장 큰 수 " + v.get(max) + " 삭제");
		System.out.print("[");
		v.remove(max);
		for(i = 0; i < v.size(); i++) {
			System.out.print( v.get(i));
			if(v.get(min) > v.get(i))
				min = i;
			if(i != v.size() - 1)
				System.out.print(", ");
		}
		System.out.println("]");
		System.out.println("가장 작은 수 " + v.get(min) + " 삭제");
		System.out.print("[");
		v.remove(min);
		for(i = 0; i < v.size(); i++) {
			System.out.print( v.get(i));
			if(i != v.size() - 1)
				System.out.print(", ");
		}
		System.out.print("]");
		
s.close();		
	}

}
