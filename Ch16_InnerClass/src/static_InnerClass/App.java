package static_InnerClass;

public class App {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.print();	// 내부에서 사용하면 쉽게 사용가능
		
		// 외부로 내부 클래스를 불러올 때
		// 1. 내부 클래스 (외부 클래스의 객체가 필요함)
		Person.Head head = p1.new Head();	// Person내부의 Head클래스를 호출, 생성할때도 내부임을 짚어줘야함
		head.print();
		
		// 2. 스테틱 내부 클래스 (외부 클래스 이름.내부 클래스 이름 즉, 외부클래스의 이름으로 객체를 생성)
		Person.Body body = new Person.Body();	// 클래스 Person의 Body를 순서대로
		body.print(); 
	}
}
