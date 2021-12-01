package application;

public class BooleanAndOr {

	public static void main(String[] args) {
		// && 와 || 를 합쳐서 사용
		boolean isRaining = false;		// 비가 오는가?
		boolean mightRain = true;	// 비가 올 수도 있나?
		boolean haveUmbrella = false;	// 우산을 가지고 있나?
		
		// 1번 방법 - 하나의 if조건에서 차례로 비교
		if((isRaining || mightRain) && haveUmbrella) {	// or연산 후 and연산
			System.out.println("우산을 쓴다");
		}
		else {
			System.out.println("우산을 쓰지 않는다");
		}
		
		// 2번 방법 - 두 개 먼저 비교 후 결과를 나머지 하나와 비교
		boolean rainCheck = isRaining || mightRain;		// 둘 중 하나라도 true이면 true
		
		if(rainCheck && haveUmbrella) {			// 둘 다 true일때만 true
			System.out.println("우산을 쓴다");
		}
		else {
			System.out.println("우산을 쓰지 않는다");
		}
		
	}

}
