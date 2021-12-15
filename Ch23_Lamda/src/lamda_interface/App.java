package lamda_interface;

import java.util.function.Predicate;

public class App {
	public static void main(String[] args) {
		// predicate 를 사용
		// predicate : 제넥릭 타입의 미리 지정된 함수형 인터페이스로, Type T 인자를 받고 boolean을 리턴하는 인터페이스임
		Predicate<String> p1 = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				// 입력된 타입의 객체를 검사해 true, false로 리턴
				return t.length() < 4;
			}
		};
		System.out.println(p1.test("abcdf"));
		System.out.println(p1.test("하나둘"));
		
		Predicate<String> p2 = s -> s.length() < 4;
		System.out.println(p2.test("one"));
		System.out.println(p2.test("three"));
	}
}
