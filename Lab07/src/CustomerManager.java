import java.util.*;
public class CustomerManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String,Integer> h = new HashMap<String,Integer>();
		String st;
		int num,c = 0;
		System.out.println("** ����Ʈ ���� ���α׷��Դϴ� **");
		while(true) {
			if(c != 0)
				System.out.println(" ");
			System.out.print("�̸��� ����Ʈ �Է�>> ");
			st = sc.next();
			num = sc.nextInt();
			if(st.equals("�׸�"))break;
			if(h.containsKey(st))
				num += h.get(st); 
			h.put(st, num);
			Set<String> keys = h.keySet();
			Iterator<String> it = keys.iterator();
			while(it.hasNext()) {
				String name = it.next();
				int number = h.get(name);
				System.out.print("(" + name + "," + number + ")");
				c++;
			}
			
				
		}
		sc.close();
	}

}
