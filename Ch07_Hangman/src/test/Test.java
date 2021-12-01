package test;	// 테스트용 패키지

import java.util.Random;

import application.RandomWord;		// 다른 패키지에 있는 RandomWord를 가져오기때문에 import가 있어야함(자동완성 단축키로 자동작성가능)

public class Test {
	public static void main(String[] args) {
//		RandomWord r = new RandomWord();
//		r.getWords();		// 단어를 모두 출력
//		System.out.println(r.toString());		// 한 개의 선택된 단어만 출력
		
		
		
		
		// 랜덤으로 단어를 가져오는 방법?
		Random random = new  Random();		// 랜덤을 사용하기 위해 랜덤객체를 생성
		
		String[] words = {"펭수", "고양이", "라이언", "늑대", "호랑이"};
		
		for(int i = 0; i < 100; i++) {
			int randomIndex = random.nextInt(words.length);		// 0 ~ (배열갯수 - 1) 을 랜덤으로 출력
			System.out.println(randomIndex);
		}
		
		// 랜덤숫자가 출력되도록 수정
		
	}
}
