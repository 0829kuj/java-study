package parameter;

public class App {

	public static void main(String[] args) {
		// 매개변수(parameter 파라메터)가 있는 메소드 사용
		Calculator cal = new Calculator();
		int number = 5;
		int result = cal.square(number);	// 메소드 square의 매개변수 x에 number의 값을 대입한 값을 정수형변수 result에 저장
		
		System.out.println("square : " + result);
		
		result = cal.plus(10, 11);
		System.out.println("plus : " + result);
		result = cal.minus(10, 5);
		System.out.println("minus : " + result);
		result = cal.multi(10, 11);
		System.out.println("multi : " + result);
	}

}
