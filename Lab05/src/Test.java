
class Item{
	protected int price;
	protected String name;
}
class Food extends Item{
	public Food(String name ,int price){
		super.price = price;
		super.name = name;
	}
	public String toString() {
		return "[Food]" + name;
	}
	
}
class Book1 extends Item{
	private String author;
	public Book1(String name, int price, String author) {
		super.price = price;
		super.name = name;
		this.author = author;
	}
	public String toString() {
		return "[Book]" + name + ", ���� : " + author;
	}
}
class Movie extends Item{
	private String director;
	public Movie(String name, int price, String director) {
		super.price = price;
		super.name = name;
		this.director = director;
	}
	public String toString() {
		return "[Movie]" + name + ", ���� : " + director;
	}
	
}
class Buyer{
	private int money;
	public Buyer(int money) {
		this.money = money;
	}
	public void buy(Item item , int num){
		money = money - item.price *num;
		System.out.println(item.toString() + "=>" + num +"�� ����" );
		if( money > 0)
			System.out.println("���� �Ϸ� �� �ܾ� : " + money);
		else
			System.out.println("�ܾ� ���� : " + (money + item.price *num));
	}
	 
}
public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer m = new Buyer(40000);
		m.buy((new Food("�����", 5000)), 3);
		m.buy((new Food("���",3000)), 2);
		m.buy((new Book1("Java Programming",7000,"�ڹ�")), 1);
		m.buy((new Movie("�λ���",8000,"����ȣ")), 1);
		m.buy((new Food("���", 2000)), 3);
	}

}
