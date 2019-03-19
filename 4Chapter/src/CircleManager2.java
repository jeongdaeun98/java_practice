import java.util.Scanner;

   class Circle2 {
	   
	private double x,y;
	private int radius;
	
	public Circle2(double x, double y, int radius) {
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
public class CircleManager2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle2 c[] = new Circle2[3];
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < c.length; i++) {
			System.out.print("x, y, radius >>");
			double x = s.nextDouble();
			double y = s.nextDouble();
			int radius = s.nextInt();	
			c[i] = new Circle2(x, y, radius);
		}
		int biggestIndex = 0;
		for(int i = 1; i < c.length; i++) {
			if(c[i].getArea() > c[biggestIndex].getArea()) {
				biggestIndex = i;
			}
			System.out.println("���� ������ ū ����");
			c[biggestIndex].show();
			s.close();
			
		}
		
		

	}

}
