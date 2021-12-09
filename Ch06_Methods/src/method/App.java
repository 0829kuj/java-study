package method;

public class App {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		// 인스턴스 변수의 값이 없을때 자동으로 0(숫자형일때), null(주소값, 문자열일때) 으로 초기화됨
		System.out.println(p1.name);		// 주소값의 초기값인 null이 출력
		System.out.println(p1.age);			// 숫자형의 초기값인 0이 출력
		
		p1.sayHello();		// 메소드 호출
		
		p1.name = "펭수";
		p1.age = 7;
		
//		System.out.println(p1.name);
//		System.out.println(p1.age);
		
		p1.sayHello();		// 여기서 메소드를 다시 호출하면 name에 "펭수"가 들어간 상태로 출력된다
		
		Person p2 = new Person();
		p2.name = "라이언";
		p2.age = 26;
		
		p2.sayHello();		// p1이나 p2나 이름은 다르지만 메소드는 동일
	}

}
