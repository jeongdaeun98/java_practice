import java.util.StringTokenizer;

public class Example {
	public static void main(String args[]) {
		int sum = 0, count = 0;
		StringTokenizer st = new StringTokenizer("a=3,b=5,c=6","=,");
		while(st.hasMoreTokens()) {
			String str = st.nextToken();
			count ++;
			//System.out.println(str);
			if(count %2 == 0)
				sum += Integer.parseInt(str);
		}
		String a = "�����ٶ�";
		System.out.println(a == "�����ٶ�");
		String b = a;
		System.out.println(a == b);
	}
}
