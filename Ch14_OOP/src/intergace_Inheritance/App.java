package intergace_Inheritance;

public class App {

	public static void main(String[] args) {
		// 인터페이스는 인터페이스를 상속
		DefaultRunnable m1 = new Machine();	// 인터페이스를 Machine이 구현했기때문에 객체를 만들 수 있음
		m1.run();
		m1.displayDetails();

	}

}
