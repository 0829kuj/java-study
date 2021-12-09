package default_Constructor;

public class App {

	public static void main(String[] args) {
		// 디폴트 생성자 : 생성자가 없을 때 적용됨, 생성자가 있으면 더 이상 적용안됨
		Person p1 = new Person();	// p1은 기본생성자
		System.out.println(p1);		// toString메소드가 생략되어있음
		Person p2 = new Person("펭수");	// 이름만 알 때
		System.out.println(p2);
		Person p3 = new Person("라이언", 5);	// 둘 다 알때
		System.out.println(p3);

	}

}
