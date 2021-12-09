package example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Book_wordSet {

	public static void main(String[] args) {
		// 책 전체 내용을 읽어 단어를 분리해 리스트에 넣기
		// 이 때 리스트는 단어가 중복되지 않는다. 알파벳 순으로 저장 => TreeSet
		File mobyDick = new File("Moby-Dick.txt");	// 앞에 경로가 없을 경우 상대경로로 현재 폴더를 의미
		
		System.out.println(mobyDick.exists()); // 파일이 있는지 확인, 있으면 true

		TreeSet<String> mobyList = loadWords(mobyDick);
		
		System.out.println(mobyList.size()); // mobyList의 단어 갯수 확인
		
		for(String w : mobyList) {
			System.out.println(w);
		}
	}
	/**
	 * 입력된 파일을 읽어서 단어별로 저장해 마지막에 트리셋 리스트로 리턴
	 * @param mobyDick
	 * @return
	 */
	private static TreeSet<String> loadWords(File mobyDick) {
		TreeSet<String> wordSet = new TreeSet<>();
		// 파일 읽기
		try (BufferedReader reader = new BufferedReader(new FileReader(mobyDick))){	
			String line = null;
					//한줄 읽기
			while((line = reader.readLine()) != null) { //파일의 끝에 더이상 문자가 없으면 null
				String[] words = line.split("[^a-zA-Z]");
				// 트리셋에 단어로 분리해서 입력한다(자동 정렬 및 중복제거)
				for(String w : words) {
					if(w.length() < 10) {	// 단어의 철자가 10자 미만인 것들은 뛰어넘도록
						continue;
					}
					wordSet.add(w.toLowerCase());	// 소문자로 단어 입력
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못했음");
		} catch (IOException e) {
			System.out.println("파일을 읽지 못함");
		}
		
		return wordSet;
	}
	
	private static void displayWords(TreeSet<String> words) {
		// 이건 모르겠는데...tab으로 띄워도 답처럼 정렬이 안될거고.....
	} 

}
