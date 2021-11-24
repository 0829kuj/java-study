package application;

// 하나의 파일에 여러개의 클래스를 만들 수 있음
class Person {
	String name;		// 인스턴스 변수, 객체를 생성해야 사용할 수 있고 그 전엔 그냥 코드일뿐임
}
// public class는 한 파일에 하나만 생성가능, 파일이름과 같음
public class ClassObject {

	public static void main(String[] args) {
		// 클래스와 객체
		// 클래스는 설계도이고 실제 사용가능한 객체를 생성(객체는 실제 메모리에 생성됨 = 인스턴스), 객체가 인스턴스보다 좀 더 넓은 의미로 이해하면됨
		// 클래스 선언만으론 메모리에 생성되지 않음, new 로 선언을 해줘야 사용할 수 있음
		
		// static : 클래스와 다르게 처음부터 메모리에 올라있음

		Person p1 = null;		// 참조변수 person클래스타입 p1을 선언만 한 상태, 초기값 없음, 참조변수는 주소값이 들어가야하므로 정수형 등의 값은 넣을수없음
		System.out.println(p1);		// 위에서 null을 넣어줬으니 null로 나옴
		p1 = new Person();		// person의 실제 객체를 생성하여 그 주소값을 p1에 대입
		System.out.println(p1);	// person의 주소값이 출력됨
		
		p1.name = "펭수";
		
		Person p2 = new Person();
		p2.name = "길동";
		Person p3 = new Person();
		p3.name = "라이언";
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p3.name);
		
	}

}
