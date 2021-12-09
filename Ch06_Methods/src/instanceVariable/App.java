package instanceVariable;

public class App {

	public static void main(String[] args) {
		// 같은 패키지 안에 있는 Person 클래스를 사용
		// 스캐너를 사용하려면 스캐너 클래스를 import 해야함
		Person p1 = new Person();
		p1.name = "펭수";
		p1.age = 10;
		Person p2 = new Person();
		p2.name = "길동";
		p2.age = 17;
		Person p3 = new Person();
		p3.name = "라이언";
		p3.age = 35;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p3.name);
		System.out.println(p3.age);
		
		//Person.name = "홍길동";			// 클래스를 바로 사용은 불가, 객체를 생성 후 사용해야함

	}

}
