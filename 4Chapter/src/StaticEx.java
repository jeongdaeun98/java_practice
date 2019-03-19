class ArrayUtil{
	public static int [] concat(int[] a, int[] b) {
		int i;
		int arrayNumber;
		arrayNumber = a.length + b.length;
		int array[] = new int [arrayNumber];
		for(i = 0; i < a.length; i++)
			array[i] = a[i];
		
		for(i = 0; i < b.length; i++)
			array[a.length + i] = b[i];
		
		return array;
		
	}
	public static void print(int[] a) {
		System.out.print("[ ");
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.print("]");
	}
}
public class StaticEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array1 = {1, 5, 7, 9};
		int [] array2 = {3, 6, -1, 100, 77};
		int [] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);

	}

}
