package integerVariable;

public class App {

	public static void main(String[] args) {
		// 변수 만들기 : 1. 변수선언(타입, 자료형), 2. 변수 초기화
		int x = 10;
		int y = 30;
		int z = x + y;
		
		int a; //변수 a를 선언 (타입필요)
		int b = 10;	//변수 b는 선언과 동시에 초기화
		a = 7;
		
		System.out.println("변수 z의 값은: " + z);		//문자열("") + 정수 = 전부 문자열
		System.out.println("변수 a + b의 값은: " + a + b);
		
		//변수는 값을 재할당할 수 있다
		z = a * b;
		System.out.println("변수 z의 값은: " + z);
	}

}
