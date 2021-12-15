package lamda_example;
// 람다식을 쓰려면 functional interface (자바의 람다식은 함수형 인터페이스로만 사용한다)
@FunctionalInterface
public interface Test {
	void run();	// 추상 메서드 run을 생성 => 생성해주면 함수형 인터페이스 조건을 만족함
//	void run2();	// 함수형 인터페이스는 '하나'의 추상메서드만 가진 인터페이스임
}
