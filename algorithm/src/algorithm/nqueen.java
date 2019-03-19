package algorithm;
import java.util.Scanner;

public class nqueen {
	static double count = 0;
	static int n;
	static int k = 1;
	static int x[];
	static int a[];
		
	
	static public void printSolution() {
		for(int i = 1; i<=n; i++){
			System.out.print(x[i]+" ");
		}
		System.out.println("");
	}
	static public void getNext() {
		int i = 0;
		for(int j = 0; j <= n; j++) {
			if(a[j] == x[k])
				i=j;	
		}
		while(i < n) {
			i++;
			count++;
			
			x[k] = a[i];
			System.out.println(count+" "+x[k]);
			if(bound(x,k) == true)
				return;
			}
			if(i == n) 
				x[k] = a[0];
			
	}
	static public boolean bound(int x[],int k) {
		for(int i = 1; i < k; i++) {
			if(x[i] == x[k] || (k - i) == Math.abs(x[k]-x[i]))
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		x = new int[n+1];
		a = new int[n+1];
	
		for(int i = 0; i <= n; i++)
			a[i] = i;
		
		for(int i = 1; i <= n; i++) {
			x[i] = a[0];
		}
		
		while(0 < k && k <= n) {
			getNext();
			if(x[k] == a[0])
				k--;
			else {
				if(k == n)
					printSolution();
				else
					k++;
			}
		}
		System.out.print(count+", ");
		double num = (Math.pow(n, n+1)-1)/(n-1);
		System.out.print(num+", ");
		double number = Double.parseDouble(String.format("%.2f",count/num));
		System.out.print(number);
		}
		
	}


