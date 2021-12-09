package this_Constructor;

public class Person {
	private String name;
	private int age;	
	
	public Person() {	
		// this() 는 현재 클래스의 생성자를 가리킨다
		this("익명", 0);	// 이름과 나이 즉, 매개변수가 2개이므로 아래의 public Person(String name, int age)를 가리킨다
	}
	
	public Person(String name) {	// 이름만 알 때
		this(name, 0);	// 마찬가지로 매개변수가 2개이므로 아래의 public Person(String name, int age)를 가리킨다
	}
	public Person(String name, int age) {	// 둘 다 알 때
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {		// 객체의 정보를 출력한다
		return "Person [이름= " + name + ", 나이= " + age + "]";
	}
	
}
