package default_Constructor;

public class Person {
	private String name;	// 이름변수
	private int age;		// 나이변수
	
	public Person() {		// 나이이름을 둘 다 모를때 사용할 기본생성자
		System.out.println("디폴트 생성자로 생성됨");
		name = "모름";
		age = 0;
	}
	
	public Person(String name) {	// 생성자는 클래스 이름과 같고 리턴타입이 없음
		// 이름만 알 때
		System.out.println("새 person이 생성됨");
		this.name = name;
		age = 0;
		// ㄴ앞의 name은 private name의 name, 뒤의 name은 public Person(String name) 의 name
	}
	public Person(String name, int age) {	// 이름과 나이가 동시에 들어가는 메소드
		// 둘 다 알 때
		System.out.println("새 person이 생성됨");
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {		// 객체의 정보를 출력한다
		return "Person [이름= " + name + ", 나이= " + age + "]";
	}
	
}
