
public class TV {

	String company;
	int year;
	int size;
	
	public TV(String a, int year, int size){
		company = a;
		this.year = year;
		this.size = size;
	} 
	public void show() {
		System.out.println(company + "���� ���� " + year + "���� " + size + "��ġ TV");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();

	}

}
