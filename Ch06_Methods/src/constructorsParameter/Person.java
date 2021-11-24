package constructorsParameter;

public class Person {
	private String name;
	private double height;
	
	//public Person() {}	// 기본생성자, 생략가능하므로 특별히 만들어주지 않아도 동작함
	// 생성자 메소드 : public + 클래스명(), 리턴타입 없음
	public Person() {
		name = "익명";			// 초기값을 지정
		height = 170;			// 초기값을 지정, 입력을 받지 않아도 지정해둔 값이 나오도록
		System.out.println("한 사람을 생성!");
	}
	public Person(String name, double height) {		// 매개변수로 이름과 키를 입력받음
		this.name = name;
		this.height = height;
		System.out.println("한 사람을 생성!");
		
	}
	// 위처럼 같은이름의 두 메소드를 만들어도 하나는 매개변수를 쓰고 하나는 쓰지 않으면 다른 메소드로 취급해 두개를 만들어도 에러가 나지 않는다
	
	
	// toString 메소드
	// get메소드로 변수값을 하나씩 츨력하는 대신 toString 메소드로 한번에 출력가능
	public String toString() {
		return "이름: " + name + ", 키: " + height;
	}
	
	
	// get set 메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
}
