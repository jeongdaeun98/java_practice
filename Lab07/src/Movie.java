
public class Movie {

	private String director;
	private int year;
	private String genre;
	
	public Movie(String director, int year, String genre) {
		this.director = director;
		this.year = year;
		this.genre = genre;
	}
	public Movie() {
		
	}
	
	public int getYear() {
		return year;
	}
	public String getDirector() {
		return director;
	}
	public String getGenre() {
		return genre;
	}
	
}
