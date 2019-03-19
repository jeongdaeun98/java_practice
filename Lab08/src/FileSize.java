import java.io.File;
public class FileSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File("C:\\");
		File []subFiles = dir.listFiles();
		int max;
		max = 0;
		for(int i = 0; i < subFiles.length; i++) {
			if(subFiles[max].length() < subFiles[i].length())
				max = i;
		}
		System.out.println("가장 큰 파일은 " + subFiles[max].getPath() + " " + subFiles[max].length() + "바이트");

	}

}
