
public class MyPoint {
	private int x;
	private int y;
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public boolean equals(MyPoint p) {
		if(p.x == this.x && p.y == this.y)
			return true;
		else
			return false;
	}
	public String toString() {
		return "Point(" + this.x + "," + this.y + ")";  
	}
}
