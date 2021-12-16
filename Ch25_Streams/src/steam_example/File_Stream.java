package steam_example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File_Stream {

	public static void main(String[] args) throws IOException {
		// 파일 스트림
		// Files클래스의 lines메소드 : 해당 파일의 각 라인을 String타입의 stream으로 만들어준다
		Path path = Paths.get("C:\\java502\\java-study\\Ch22_CollectionsAPI\\GrannyFox.txt");
		Files.lines(path).forEach(s -> System.out.println(s));	// txt파일 한 줄씩 전체출력

	}

}
