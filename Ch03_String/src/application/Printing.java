package application;

public class Printing {

	public static void main(String[] args) {
		// 문자열 (+) , 출력
		String name = "홍길동";
		System.out.println("내 이름은\t" + name); 	// 문자열끼리는 + 로 더한다
		String text = "나의 이름은 : ";
		String endOfSentence = ".";
		
		System.out.println(text + name + endOfSentence);
		System.out.println("나의 이름은 \"홍길동\".");

	}

}
