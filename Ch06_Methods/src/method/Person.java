package method;

public class Person {
	// 클래스 안의 일반 변수 => 인스턴스 변수 (객체 생성시 자동생성)
	String name;
	int age;
	
	// 클래스 안에 만든 함수를 메소드라고 함 => 객체 생성시 사용가능
	// sayHello라는 이름의 메소드를 생성
	void sayHello() {			// 메소드명 앞은 리턴타입임 - 여기는 리턴타입이 없어서 void로 선언
		System.out.println("헬로!" + name);
	}

}
