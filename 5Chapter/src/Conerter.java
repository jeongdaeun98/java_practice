
import java.util.Scanner;
abstract class Conerter {
	abstract protected double convert(double src); // �߻� �޼ҵ�
	abstract protected String srcString(); // �߻� �޼ҵ�
	abstract protected String destString(); // �߻� �޼ҵ�
	protected double ratio; // ����
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(srcString() + "�� " + destString() + "�� �ٲߴϴ�.");
		System.out.print(srcString() + "�� �Է��ϼ���>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ ���: " + res + destString() + "�Դϴ�");
		scanner.close();
	}
}