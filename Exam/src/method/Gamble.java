package method;

public class Gamble {

	public static void main(String[] args) {
		double doller = dice() + dice() + dice();
		double won = exchange(doller);
		System.out.printf("획득금액: $%.2f(%.0f원)", doller, won);
		
	}
	
	private static int dice() {
		// Math.random() 메소드로 1~6 사이의 정수를 반환
		return 0;
	}
	
	private static double exchange(double doller) {
		// 입력받은 달러를 원으로 환전하여 반환
		return 0;
	}
}
