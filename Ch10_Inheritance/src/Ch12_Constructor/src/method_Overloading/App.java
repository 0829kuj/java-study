package method_Overloading;

public class App {

	public static void main(String[] args) {
		// 메소드 오버로딩 : 메소드의 이름은 같지만 매개변수가 다를때
		// 메소드는 이름과 매개변수가 모두 같아야 동일한 메소드임
		Person p = new Person();
		p.greet();			// 매개변수 없음
		p.greet("펭수");		// 매개변수 있음
		p.greet(175);
		p.greet("펭순이", 190);
		System.out.println(123);	// 매개변수 정수
		System.out.println(1.23);	// 매개변수 실수
		System.out.println("123");	// 매개변수 문자열
	}

}
