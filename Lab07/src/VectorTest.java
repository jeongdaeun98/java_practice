import java.util.Vector;
import java.util.Scanner;
public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		Scanner s = new Scanner(System.in);
		int num, max, min, i;
		System.out.print("����(-1�� �Էµ� �� ����)>>");
		while(true) {
			num = s.nextInt();
			if(num == -1) break;
			v.add(num);
		}
		max = 0;
		min = 0;
		System.out.print("���� �� : [");
		for(i = 0; i < v.size(); i++) {
			if(v.get(max) < v.get(i))
				max = i;
			System.out.print( v.get(i));
			if(i != v.size() - 1)
				System.out.print(", ");
		}
		System.out.println("]");
		System.out.println("���� ū �� " + v.get(max) + " ����");
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
		System.out.println("���� ���� �� " + v.get(min) + " ����");
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
