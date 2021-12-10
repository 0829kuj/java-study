package method;

import java.util.Random;

public class Gamble {

	public static void main(String[] args) {
		double doller = dice() + dice() + dice();
		double won = exchange(doller);
		System.out.printf("획득금액: $%.2f (%.0f원)", doller, won);
//		System.out.println(doller);		// radom메소드 확인용
	}
	
	private static int dice() {
		// 1~6 사이의 정수를 반환
		// 방법 1) Math.random() 메소드 사용
//		int rand = (int)(Math.random() * 6) +1;	// random()을 int로 형변환
		// Math.random() : 0.0이상 1.0미만의 값중 하나를 double형으로 반환
		
		// 방법2) java.util에 포함된 Random 클래스를 이용한 방법
		Random random = new Random();
		int rand = random.nextInt(6) + 1; // nextInt(6)은 0~5중 하나를 고르므로 +1을 해줌
		return rand;
	}
	
	private static double exchange(double doller) {
		// 입력받은 달러를 원으로 환전하여 반환
		double ex = doller * 1082.25108;
		return ex;
	}
}
