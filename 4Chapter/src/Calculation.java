import java.util.Scanner;
class Add{

	int a ,b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate(){
		return a + b;
		
	}
	
}
class Sub{
	int a ,b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
		
	}
	public int calculate(){
		int result;
		if(a > b)
			result = a - b;
		else
			result = b - a;
		return result;
	}
	
}
class Mul{
	int a ,b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
		
	}
	public int calculate(){
		return a*b;
	}
	
}
class Div{
	int a ,b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
		
	}
	public int calculate(){
		int result;
		if(a > b)
			result = a/b;
		else
			result = b/a;
		
		return result;
	}
	
}
public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a,b;
		String str;
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>>");
		a = s.nextInt();
		b = s.nextInt();
		str = s.next();
		switch(str) {
		case "+" :
			Add add = new Add();
			add.setValue(a, b);
			System.out.println(add.calculate());
			break;
		case "-" :
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.println(sub.calculate());
			break;
		case "*" :
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.println(mul.calculate());
			break;
		case "/" :
			Div div = new Div();
			div.setValue(a, b);
			System.out.println(div.calculate());
			break;
		}
		
		

	}

}
