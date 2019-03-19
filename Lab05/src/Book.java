
public class Book {
	private String title;
	private int pageNumber;
	private String author;
	private static int count = 0;
	public Book(String title, int pageNumber, String author) {
		this.title = title;
		this.pageNumber = pageNumber;
		this.author = author;
		count++;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public static int getCount() {
		return count;
	}

}

