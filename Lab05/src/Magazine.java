
 public class Magazine extends Book{
	private String buyDay;
	
	public Magazine(String title, int pageNumber, String author,String buyDay) {
		super(title, pageNumber, author);
		this.buyDay = buyDay;
	}
	public String getBuyDay() {
		return buyDay;
	}
	public void setBuyDay(String buyDay) {
		this.buyDay = buyDay;
	}
	
}