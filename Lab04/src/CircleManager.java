
import java.util.Scanner;

   class Circle {
	   
	private double x,y;
	private int radius;
	
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		
	}
	public void show() {
		System.out.println("("+ x + "," + y + ")" + radius);
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}
}
public class CircleManager {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c[] = new Circle[3];
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < c.length; i++) {
			System.out.print("x, y, radius >>");
			double x = s.nextDouble();
			double y = s.nextDouble();
			int radius = s.nextInt();	
			c[i] = new Circle(x, y, radius);
		}
		int biggestIndex = 0;
		for(int i = 1; i < c.length; i++) {
			if(c[i].getArea() > c[biggestIndex].getArea()) {
				biggestIndex = i;
			}
			System.out.println("가장 면적이 큰 원은");
			c[biggestIndex].show();
			s.close();
			
		}
		
		

	}

}
