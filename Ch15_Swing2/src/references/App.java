package references;

class Person {
	
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();	// p1은 객체가 생성된 위치, 측 주소(address)를 가진다
		System.out.println(p1);		// toString 오버라이딩을 안했을 경우 객체의 주소를 나타냄
		
		Person p2 = p1;		// 주소를 넘김
		
		System.out.println(p2);
		test(p2);	// 메소드 test에 매개변수로 p2전달
	}
	static void test(Person p) {
		System.out.println(p);	// 매개변수로 입력된 p의 주소를 출력한다
	}

}
