package getterSetter;

public class Person {
	// private는 같은 클래스에서만 접근가능
	private String name;
	private int age;
	
	// public은 다른 클래스에서도 접근가능
	// set은 값을 입력하는 메소드
	public void setName(String name) {
		this.name = name;		// 이때 this는 인스턴스를 의미(여기서는 private String name), = 뒤의 name은 바로 윗줄의 (String name)을 의미
	}
	// get메소드는 값을 리턴하는 메소드
	public String getName() {
		return name;
	}
	
	// set get age만들기
	public void setAge(int age) {	// set은 입력하는 메소드라서 매개변수(맞나?)가 필요한거고
		System.out.println(this);		// this는 new Person의 객체의 주소를 가리키게됨
		this.age = age;
	}
	public int getAge() {	// get은 값을 리턴하는 메소드라서 매개변수가 필요없나?
		System.out.println(this);		// this는 p1이 호출하면 p1의, p2가 호출하면 p2의 주소값을 가짐
		return age;
	}
}
