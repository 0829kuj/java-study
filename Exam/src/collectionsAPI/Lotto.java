package collectionsAPI;

import java.util.Random;

// 연습문제 2
class LottoMachine {
	// 필드
	private int[] LottoNumbers;
	
	// 생성자
	public LottoMachine() {
		// 2. 메소드를 이용해서 로또번호 생성 초기화
		LottoNumbers = generate();
		// ㄴ 모르겠다..pickNumbers로 받아온 배열을 LottoNumbers로 넘겨야하는데..일단 gnerate()메소드호출해봄
	}
	
	// 메소드
	public int[] generate() {
		int[] pickNumbers = new int[6];
		
		Random rand = new Random();
		// 1. 임의의 숫자 6개를 추출하시오
		
		// int값의 범위에서 정수 랜덤값을 추출한다
//		num1 = rand.nextInt(6) + 1;
//		System.out.println("A ramdom integer: " + num1);
		
		// 0~9 사이의 정수 랜덤값을 추출한다
//		num1 = rand.nextInt(10);
//		System.out.println("From 0 to 9: " + num1);
		
		// 1~10사이의 정수 랜덤값을 추출한다
//		num1 = rand.nextInt(10) + 1;
//		System.out.println("From 1 to 10: " + num1);
		
		for(int i = 0; i < 6; i++) {
			pickNumbers[i] = rand.nextInt(45) + 1;	// 1~45사이의 랜덤int
		}
		
		return pickNumbers;
	}
	// 3. 생성된 로또번호를 가져오는 get메소드를 완성하시오
	public int[] getLottoNumbers() {
		return LottoNumbers;
	}
}

public class Lotto {
	/*
	 로또는 1~45 사이의 정수 중 중복되지 않는 6개의 숫자를 정하여 맞춰야한다. 6개의 로또번호를 자동생성하도록 하시오.
	 */
	public static void main(String[] args) {
		// 객체 생성
		LottoMachine machine = new LottoMachine();
		
		// 로또 번호 가져오기
		int[] numbers = machine.getLottoNumbers();
		
		// 결과 출력
		System.out.print("생성 번호: ");
		for (int i : numbers) {
			System.out.printf("%d ", i);
		}

	}
}
