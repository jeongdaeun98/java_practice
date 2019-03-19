
public class twoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[][] = new int[4][4];
		int count = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		int t = 0;
		
		for(i = 0; i < 4; i++) {
			for(j = 0; j < 4; j++) {
				n[i][j] = 0;
			}
		}
		while(true) {
			k = (int)(Math.random()*4);
			t = (int)(Math.random()*4);
			if(n[k][t] == 0) {
			n[k][t] = (int)(Math.random()*10 + 1);
			count ++;
			}
			if(count == 10)
				break;
			}
		
		count = 0;
		for(i = 0; i < 4; i++) {
			for(j = 0; j < 4; j++) {
				System.out.print(n[i][j] + "\t");
				count++;
				if(count % 4 == 0)
					System.out.println(" ");
			}
		}
	}

}
