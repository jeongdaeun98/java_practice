
public class Circle {

	private int x, y, r;
	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	public String toString() {
		return "Circle(" + this.x + "," + this.y + ")¹ÝÁö¸§" + this.r;
	}
	public boolean equals(Circle c) {
		if(this.x == c.x && this.y == c.y) return true;
		else return false;
		
	}
}
