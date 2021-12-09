package file_location;

import java.io.File;

public class App {
	public static void main(String[] args) {
		// 파일의 위치
		String fileLocation = "C:\\JAVA\\java-study3\\CH20_Reading_Writing\\test.txt";
		System.out.println(new File(fileLocation).exists());
		System.out.println();
		
	}

}
