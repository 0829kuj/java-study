package local_InnerClass;

public class App {
	private String name;	// 객체를 생성해야 사용할 수 있는 인스턴스변수
	
	public App() {
		name = "엘리자베스";
	}
	
	public static void main(String[] args) {
		// 메소드 로컬 이너 클래스
//		System.out.println(name);	// main은 static 메소드이므로 인스턴스변수 사용불가
		App app = new App();
//		app.name = "펭수";
		
		app.run();
	}
	private void run () {
		// 이너클래스 : 클래스 안의 클래스
		// 현재의 경우엔 클래스 안의 메소드에 클래스
//		System.out.println(name); 	// name을 출력하는 메소드
		class Printer {		// 로컬 이너 클래스
			public void print() {
				System.out.println(name);	// 내부 클래스는 상위 클래스의 변수를 사용가능
				// ㄴ 이 name은 App클래스의 name
			}
		}
		// 일반적인 실행
		Printer p = new Printer();
		p.print();
		// 위와 동일. 단 확실한 주소값은 알 수 없다
		new Printer().print();	// print메소드 실행
	} 

}
