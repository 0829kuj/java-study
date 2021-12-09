package enum_example;

public class App {

	public static void main(String[] args) {
		// enum (열거) : 관련이 있는 상수들의 집합. 클래스가 상수만으로 작성되어 있으면 꼭 클래스로 선언할 필요 없음
		// enum으로 선언 시 이 객체가 상수의 집합임을 나타냄
		// enum을 클래스 처럼 사용
		Fruit f1 = Fruit.APPEL;		// Fruit enum의 상수 APPLE을 가리킴
		Fruit f2 = Fruit.BANANA;
		Fruit f3 = Fruit.ORANGE;
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println("f1과 f2가 같은가? " + ( f1 == f2 ));

	}

}
