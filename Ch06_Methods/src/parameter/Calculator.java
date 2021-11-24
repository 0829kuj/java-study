package parameter;

public class Calculator {
	int square(int x) {	// 매개변수 x, 리턴타입은 정수
		return x * x;	// 입력된 x의 값을 제곱으로 리턴
	}
	int plus(int x, int y) {
		return x + y;
	}
	int minus(int x, int y) {
		return x - y;
	}
	int multi(int x, int y) {
		return x * y;
	}
}
