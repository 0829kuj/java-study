package super_constructor;

public class Employee extends Person {	// Person을 상속받음
	public Employee() {
		super("익명");	// 부모클래스의 생성자, 평소에는 생략되어있음
		// ㄴ부모클래스의 생성자에 매개변수가 있기때문에 super에도 매개변수를 넣어줘야 오류가 안남
		System.out.println("Employee 생성자");
	}	// 이렇게되면 부모클래스의 생성자(Person)를 먼저 실행항 후 Employee의 생성자가 실행됨
	public Employee(String name) {
		super(name);
		System.out.println("Employee 생성자");
	}
	
}
