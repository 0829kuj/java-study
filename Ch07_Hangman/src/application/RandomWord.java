package application;

import java.util.Random;

public class RandomWord {
	// 스페이스바로 띄어진 단어들을 문자열로 str에 저장
	private String str = "language community classroom conversation refrigerator knowledge collection difficulty attitude measurement enthusiasm manufacturer organization comparison personality environment preference election situation pollution guidance entertainment insurance requirement assistance inflation promotion patience category importance application technology variation attention criticism explanation security reputation suggestion possibility indication combination information contract activity passenger grandmother conclusion teaching weakness";
	// 스페이스바 하나를 기준으로 단어를 잘라 배열로 리턴
	private String[] words = str.split(" ");

	private String selectWord; // 랜덤으로 선택된 단어
	private char[] characters; // 문자 배열 선언 (철자를 맞추면 저장)
	private Random random = new Random();


	public RandomWord() {
		// 생성자에 랜덤단어를 선택
		// 0 ~ (배열갯수 - 1) 중의 숫자를 하나 랜덤으로 출력
		selectWord = words[random.nextInt(words.length)]; // (1) 랜덤으로 선택 수정
		characters = new char[selectWord.length()]; // 선택된 단어(selectWord)의 길이만큼 문자배열의 크기를 생성
	}

	public void getWords() { // 현재 words배열에 있는 전체 단어를 출력
		for (String w : words) {
			System.out.println(w);
		}
	}

	public String toString() {
		// 단어를 _로 출력한다
		StringBuilder sb = new StringBuilder();
//		characters[3] = 'X';	// 테스트용
		
		for(char c : characters) {
//			if(c == '\u0000') {		
//				// c가 문자의 초기값을 가질경우 (\u0000 : char(문자형)타입의 초기값, 참고로 int의 초기값은 0임), 즉 아직 못맞췄을때
//				sb.append('_');
//			}
//			else {		// 맞춘 철자의 경우 그대로 대입
//				sb.append(c);
//			}
//			sb.append(' ');
			// 위의 if문 대신 삼항 조건 연산자를 사용
			sb.append(c == '\u0000' ? '_' : c);
			sb.append(' ');
		}
//		System.out.println(selectWord); // 정답출력 (테스트용)
		return sb.toString(); // character배열의 맞춘철자는 철자를, 못맞춘 철자는 _로 반환		
	}

	public void addGuess(char c) {
		// 넘어온 문자를 검사하여 선택 단어에 있으면 characters 배열에 저장
		for(int i = 0; i < selectWord.length(); i++) {		// 단어의 길이만큼 반복
			if(c == selectWord.charAt(i)) {
				characters[i] = c;
			}
		}
		
	}
	
	public boolean isCompleted() {
		for(char c : characters) {	// 단어 전체 철차 반복 검사
			if(c == '\u0000') {
				return false;		// 아직 맞춰야 할 문자가 있음
			}
		}
		return true;		// 위의 반복문에서 return이 안되고 빠져나왔다는건 정답을 맞췄다는 의미이므로 true반환
	}
}
