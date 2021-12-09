package equals;

import java.util.Objects;

class Person {
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {	// 기본 equals메소드는 다른 객체가 값이 같은지는 비교할수없으므로 메소드를 만들어 보완함
		if (this == obj)	// 객체가 같을 경우(이름뿐만 아니라 객체 자체가 같은것)
			return true;
		if (obj == null)	// 비교대상이 null값일 경우 무조건 false
			return false;
		if (getClass() != obj.getClass())	// 클래스 타입이 다를 경우 false
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name);	// 위의 세 가지 경우가 전부 아닐 경우 이름을 비교
	}
}

public class App {
	public static void main(String[] args) {
		// equals : 같은지 비교하는 메소드, 값이 같아도 객체가 다르면 다른걸로 간주함
		Person p1 = new Person("펭수");
		Person p2 = new Person("펭수");
		
		System.out.println(p1 == p2);	// p1과 p2는 이름은 같지만 다른 객체이므로 false
		System.out.println(p1.equals(p2));	// 위와 동일한 이유로 false

	}

}
