
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
		return "[Book]" + name + ", 저자 : " + author;
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
		return "[Movie]" + name + ", 감독 : " + director;
	}
	
}
class Buyer{
	private int money;
	public Buyer(int money) {
		this.money = money;
	}
	public void buy(Item item , int num){
		money = money - item.price *num;
		System.out.println(item.toString() + "=>" + num +"개 구매" );
		if( money > 0)
			System.out.println("구매 완료 후 잔액 : " + money);
		else
			System.out.println("잔액 부족 : " + (money + item.price *num));
	}
	 
}
public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer m = new Buyer(40000);
		m.buy((new Food("비빔밥", 5000)), 3);
		m.buy((new Food("라면",3000)), 2);
		m.buy((new Book1("Java Programming",7000,"자바")), 1);
		m.buy((new Movie("부산행",8000,"연상호")), 1);
		m.buy((new Food("김밥", 2000)), 3);
	}

}
