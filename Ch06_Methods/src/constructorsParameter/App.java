package constructorsParameter;

public class App {

	public static void main(String[] args) {
		// 생성자 : 클래스의 특별한 메소드
		Person p1 = new Person("펭수", 120.0);	// 이렇게 매개변수에 바로 값을 넣으려면 메소드를 지정할때 매개변수를 통해 지정하면 된다
		// 기본 생성자는 생략가능
		Person p2 = new Person("길동", 176.8);
		
		Person p3 = new Person();

//		System.out.printf("이름 : %s , 키 : %.1f \n", p1.getName(), p1.getHeight());
//		System.out.printf("이름 : %s , 키 : %.1f \n", p2.getName(), p2.getHeight());
//		System.out.printf("이름 : %s , 키 : %.1f \n", p3.getName(), p3.getHeight());
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
	
	}

}
