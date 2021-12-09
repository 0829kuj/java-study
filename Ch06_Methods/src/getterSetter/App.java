package getterSetter;

public class App {

	public static void main(String[] args) {
		// 인스턴스 변수에 접근하는 메소드 get과 set
		Person p1 = new Person();
		// private를 쓰면 보안상 객체의 변수에 바로 접근하지 못함
		// p1.name = "펭수";
		p1.setName("펭수");
		System.out.println(p1.getName());
		p1.setAge(7);
		System.out.println(p1.getAge());
		
		Person p2 = new Person();
		p2.setName("길동");
		System.out.println(p2.getName());
		p2.setAge(42);
		System.out.println(p2.getAge());

	}

}
